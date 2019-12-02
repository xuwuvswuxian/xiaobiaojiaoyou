$(function () {
    $.ajax({
        url:"/sys/dept/deptNames",
        type:"get",
        data:"",
        dataType:"json",
        success:function (data) {
            $("#dept").append($('<option value="-1" name="dept">请选择</option>'));
            for(var dept of data){
                var option = $('<option value="'+dept.id+'" name="dept">'+dept.name+'</option>')
                $("#dept").append(option);
            }
        }
    });

    $.validator.addMethod("checkAccount", function (value, element, params) {
        var reg = /^[0-9a-zA-Z]{5,10}$/;
        if (reg.test(value)) {
            return true;
        } else {
            return false;
        }
    });
    $.validator.addMethod("checkPassword", function (value, element, params) {
        var reg = /^[\d]{6,8}$/;
        if (reg.test(value)) {
            return true;
        } else {
            return false;
        }
    });
    $.validator.addMethod("checkDeptName", function (value, element, params) {
        var reg = /^[\d]{6,8}$/;
        if (reg.test(value)) {
            return true;
        } else {
            return false;
        }
    });
    $("#form-add").validate({
        rules: {
            account: {
                checkAccount: ""
            },
            password:{
                checkPassword:""
            },
            dept:{
                checkDeptName:""
            }
        },
        messages: {
            account: {
                checkAccount: "请输入5-10位的账号！"
            },
            password:{
                checkPassword:"请输入6-8位的数字密码"
            },
            dept:{
                checkDeptName:"请选择所属部门"
            }
        }
    });
});