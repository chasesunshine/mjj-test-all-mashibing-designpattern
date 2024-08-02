package com.mashibing;

import com.huaweicloud.sdk.core.auth.BasicCredentials;
import com.huaweicloud.sdk.core.auth.ICredential;
import com.huaweicloud.sdk.core.exception.ConnectionException;
import com.huaweicloud.sdk.core.exception.RequestTimeoutException;
import com.huaweicloud.sdk.core.exception.ServiceResponseException;
import com.huaweicloud.sdk.rocketmq.v2.RocketMQClient;
import com.huaweicloud.sdk.rocketmq.v2.model.ListInstanceConsumerGroupsRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListInstanceConsumerGroupsResponse;
import com.huaweicloud.sdk.rocketmq.v2.region.RocketMQRegion;

public class Test {
    public static void main(String[] args) {
        String ak ="4VI5VCISFNGEQEEVQDPV";
        String sk = "YqZvf4aGS1lWOP6l1EyzSMtzEeA4NoRMmblCgPHm";
        String projectId = "cba155f9dfcc4d6dab53108c5da31d05";

        ICredential auth = new BasicCredentials().withProjectId(projectId).withAk(ak).withSk(sk);

        RocketMQClient client = RocketMQClient.newBuilder().withCredential(auth).withRegion(RocketMQRegion.valueOf("cn-east-3")).build();
        ListInstanceConsumerGroupsRequest request = new ListInstanceConsumerGroupsRequest();
        request.withInstanceId("75db2a0e-c2a4-4191-a47d-82f793396519");
        try {
            ListInstanceConsumerGroupsResponse response = client.listInstanceConsumerGroups(request);
            System.out.println(response.toString());
        } catch (ConnectionException e) {
            e.printStackTrace();
        } catch (RequestTimeoutException e) {
            e.printStackTrace();
        } catch (ServiceResponseException e) {
            e.printStackTrace();
            System.out.println(e.getHttpStatusCode());
            System.out.println(e.getRequestId());
            System.out.println(e.getErrorCode());
            System.out.println(e.getErrorMsg());
        }
    }

}
