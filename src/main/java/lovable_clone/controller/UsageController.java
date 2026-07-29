package lovable_clone.controller;

import lombok.RequiredArgsConstructor;
import lovable_clone.dto.subscription.PlanLimitsResponse;
import lovable_clone.dto.subscription.UsageTodayResponse;
import lovable_clone.service.UsageService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/usage")
public class UsageController {
    private UsageService usageService;

    @GetMapping("/today")
    public ResponseEntity<UsageTodayResponse>  getUsageToday() {
        Long userId = 1L;
        return ResponseEntity.ok(usageService.getUsageTodayofUser(userId));
    }

    @GetMapping("/limits")
    public ResponseEntity<PlanLimitsResponse> getPlanLimits() {
        Long userId = 1L;
        return ResponseEntity.ok(usageService.getCurrentSubscriptionLimitsOfUser(userId));
    }
}
