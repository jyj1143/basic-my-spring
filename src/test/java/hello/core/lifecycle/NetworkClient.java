package hello.core.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class NetworkClient implements InitializingBean, DisposableBean {

    private String url;

    public NetworkClient() {
        System.out.println("생성자 호출 , url=" + url);
    }


    public void setUrl(String url) {
        this.url = url;
    }
    //서비스 시작시 호출
    public void connet() {
        System.out.println("connet : " + url);
    }


    public void call(String message) {
        System.out.println("connet : " + url + " message : " + message);
    }

    //서비스 종료시 호출
    public void disconnet() {
        System.out.println("close : " + url);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("NetworkClient.destroy");
        disconnet();
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("NetworkClient.afterPropertiesSet");
        connet();
        call("초기화 연결 메시지");
    }
}
