package kg.megacom.restaurantservice.timer;

import kg.megacom.restaurantservice.database.UserSessionRepository;
import kg.megacom.restaurantservice.exceptions.UserSessionListEmptyException;
import kg.megacom.restaurantservice.model.entity.UserSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;


public class  CustomerTokenCleaner extends TimerTask {

        @Autowired
        private UserSessionRepository userSessionRepository;


    @Override
    public void run() {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
               List<UserSession> customerList = userSessionRepository.findAll();
                if (customerList.isEmpty()) {
                    throw new UserSessionListEmptyException("Лист пустой ");
                } else {
                    for (UserSession u : customerList) {
                        if (u.getEndDate().getTime() < new Date().getTime())
                            userSessionRepository.delete(u);
                        System.out.println(u.getCustomer().getPhone());
                    }
                }
            }
        },60000,120000);
    }
}

