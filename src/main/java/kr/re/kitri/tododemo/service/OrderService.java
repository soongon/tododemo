package kr.re.kitri.tododemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private DeliveryRepository deliveryRepository;
    @Autowired
    private MailRepository mailRepository;


    public void doOrder() {
        // 1. order 테이블에 인서트
        orderRepository.insertOrder();
        // 2. customer 테이블에 업데이트(고객 포인트 증가)
        customerRepository.increaseCustomerPoint(30);
        // 3. delivery 테이블에 인서트
        deliveryRepository.insertDeliveryInfo();
        // 4. 고객에게 주문완료 메일을 발송
        mailRepository.sendOrderCompleteMail();
    }
}
