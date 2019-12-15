package com.sourcetree.life;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


@Component
public class RabbitConfig {

    @Bean
    public Queue queueA(){
        return new Queue("queue111111");
    }

    @Bean
    public Queue queueB(){
        return  new Queue("queue2222222");
    }

    @Bean
    FanoutExchange fanoutExchange(){
        return  new FanoutExchange("ExchangeExchange11111");
    }

    @Bean
    public Binding bindingQueueA(Queue queueA, FanoutExchange fanoutExchange){
        return BindingBuilder.bind(queueA).to(fanoutExchange);
    }

    /**
     * 绑定队列A到交换机
     *
     * @param queueB
     * @param fanoutExchange
     * @return
     */
    @Bean
    public Binding bindingQueueB(Queue queueB, FanoutExchange fanoutExchange)
    {
        return BindingBuilder.bind(queueB).to(fanoutExchange);
    }
}
