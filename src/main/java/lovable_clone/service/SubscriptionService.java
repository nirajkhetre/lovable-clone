package lovable_clone.service;

import lovable_clone.dto.subscription.CheckoutRequest;
import lovable_clone.dto.subscription.CheckoutResponse;
import lovable_clone.dto.subscription.SubscriptionResponse;
import lovable_clone.dto.subscription.portalResponse;

public interface SubscriptionService {
    SubscriptionResponse getCurruntSubscription(Long userId);

    CheckoutResponse createCheckoutSession(Long userId, CheckoutRequest request);

    portalResponse openCustomerPortal();
}
