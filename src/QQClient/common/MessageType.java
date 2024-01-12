package QQClient.common;

public interface MessageType {
    String MESSAGE_LOGIN_SUCCESS = "1";         //登录成功
    String MESSAGE_LOGIN_FILL = "2";            //登录失败
    String MESSAGE_COMM_MSG = "3";              //普通消息
    String MESSAGE_GET_ONLINE_FRIEND = "4";     //获取在线用户列表
    String MESSAGE_RET_ONLINE_FRIEND = "5";     //返回在线用户列表
    String MESSAGE_CLIENT_EXIT = "6";           //客户端请求退出
}