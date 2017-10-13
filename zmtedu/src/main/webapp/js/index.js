var SUCCESS=0;

//用户信息注册
function register(){
    var userName=$("#userName").val();
    var pwd=$("#pwd").val();
    var data={userName:userName,pwd:pwd};
    var url="user/register";
    $.ajax({
        type : "post",
        url : url,
        data : data,
        success : function(data){
            var state=data.state;
            if(state==SUCCESS)
                alert("注册成功");
            else
                alert("注册失败");
        } ,
        error : function(){}
    });
}