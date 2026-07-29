package lovable_clone.service;

import lovable_clone.dto.subscription.PlanLimitsResponse;
import lovable_clone.dto.subscription.UsageTodayResponse;
import org.springframework.http.ProblemDetail;

public interface UsageService {
    UsageTodayResponse getUsageTodayofUser(Long userId);

    PlanLimitsResponse getCurrentSubscriptionLimitsOfUser(Long userId);
}
