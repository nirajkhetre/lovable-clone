package lovable_clone.controller;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lovable_clone.dto.subscription.*;
import lovable_clone.service.PlanService;
import lovable_clone.service.SubscriptionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BillingController {

    private final ResponseEntityExceptionHandler responseEntityExceptionHandler;
    private PlanService planService;
    private SubscriptionService subscriptionService;

    @GetMapping("api/plans")
    public ResponseEntity<List<PlanResponse>> getAllPlans(){
        return ResponseEntity.ok(planService.getAllActivePlans());
    }

    @GetMapping("api/me/subscription")
    public ResponseEntity<SubscriptionResponse> getMySubscription(){
        Long userId = 1L;
        return ResponseEntity.ok(
                subscriptionService.getCurruntSubscription(userId)
        );
    }

    @PostMapping("api/stripe/checkout")
    public ResponseEntity<CheckoutResponse> createCheckoutResponse(
            @RequestBody CheckoutRequest request
    ){
        Long userId = 1L;
        return ResponseEntity.status(HttpStatus.CREATED).body(
                subscriptionService.createCheckoutSession(userId,request)
        );
    }

    @PostMapping("api/stripe/portal")
    public ResponseEntity<portalResponse> openCustomerPortal(){
        Long userId = 1L;
        return ResponseEntity.ok(
                subscriptionService.openCustomerPortal()
        );
    }

}
