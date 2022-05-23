
package com.mycompany.looca;

import com.github.seratch.jslack.Slack;
import com.github.seratch.jslack.api.webhook.Payload;
import com.github.seratch.jslack.api.webhook.WebhookResponse;

public class Slack2 {
    private static String webHookUrl="https://hooks.slack.com/services/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";
    private static String oAuthToken="xoxb-3400608733536-3376920471586-8AcqHHh6eC5y8VzD0TTWSEYc";
    private static String slackChannel="notificações-para-o-usuário";

    public static void slackMsg(String message){
        try {
              StringBuilder msgBuilder = new StringBuilder();
    msgBuilder.append(message);
    
        Payload payload=Payload.builder().channel(slackChannel).text(msgBuilder.toString()).build();
       WebhookResponse wbResp= Slack.getInstance().send(webHookUrl,payload);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
  
    }
}
