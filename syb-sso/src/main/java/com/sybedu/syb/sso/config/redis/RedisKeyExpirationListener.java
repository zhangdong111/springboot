//package com.sybedu.gk211985.wechat.account.config.redis;
//
//import lombok.extern.slf4j.Slf4j;
//import net.tfedu.resource.manager.backend.mapper.TradeGoodsInfoMapper;
//import net.tfedu.resource.manager.backend.model.TradeGoodsInfo;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.data.redis.connection.Message;
//import org.springframework.data.redis.listener.KeyExpirationEventMessageListener;
//import org.springframework.data.redis.listener.RedisMessageListenerContainer;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.Resource;
//
//@Component
//@Slf4j
//public class RedisKeyExpirationListener extends KeyExpirationEventMessageListener {
//
//
//
//    public RedisKeyExpirationListener(@Qualifier("container") RedisMessageListenerContainer listenerContainer) {
//        super(listenerContainer);
//    }
//
//    @Override
//    public void onMessage(Message message, byte[] pattern) {
//        // 用户做自己的业务处理即可,注意message.toString()可以获取失效的key
//        String expiredKey = message.toString();
//        if(expiredKey.startsWith("trade_goods_")){

//        }
//    }
//}
