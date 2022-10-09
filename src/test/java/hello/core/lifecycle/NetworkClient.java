package hello.core.lifecycle;



public class NetworkClient {

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


    public void close() {
        System.out.println("NetworkClient.close");
        disconnet();
    }


    public void init(){
        System.out.println("NetworkClient.init");
        connet();
        call("초기화 연결 메시지");
    }
}
