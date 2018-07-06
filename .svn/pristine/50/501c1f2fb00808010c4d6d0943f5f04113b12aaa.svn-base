package com.pic.utils;
public enum Constants {
	SUCCESS(0,"请求成功"),
    FAIL(1,"请求失败"),
    
    
    LOGIN_SUCCESS(0,"注册成功"),
    LOGIN_REGISTED(102,"该号码已注册"),
    LOGIN_UNSUCCESS(103,"注册失败"),
    LOGIN_FAULTCODE(104,"验证码错误"),
    LOGIN_UNCODE(105,"验证码不能为空"),
    LOGIN_UNPWD(106,"密码不能为空"),
    LOGIN_FAULTPWD(107,"密码错误"),
    LOGIN_FAILMODIFY(108,"重置密码失败"),
    LOGIN_SUCCESSMODIFY(0,"重置密码成功"),
    LOGIN_CODE(0,"发送验证码成功"),
    LOGIN_FAILCODE(109,"发送验证码失败"),
    LOGIN_RELOGIN(110,"请重新登录"),
    LOGIN_PARAM(111,"登录参数錯誤"),
    LOGIN_TOKEN(112,"TOKEN生成失敗"),
    LOGIN_UNPHONE(113,"电话号码不能为空"),
    LOGIN_UNPHONEED(114,"电话号码未注册"),
    LOGIN_FAULTACOUNTLENGTH(115,"登录账号参数不正确"),
    LOGIN_UNFLAG(116,"flag参数错误"),
    LOGIN_UNDATAPERFECT(120,"资料不完善,完善资料后方可添加农机操作"),
    LOGIN_FAILUPDATEPWD(117,"信息修改失败"),
    LOGIN_UNNAME(118,"用户姓名不能为空"),
    LOGIN_UNUSERIDNO(119,"用户姓名不能为空"),
    LOGIN_UNUSERADDR(121,"用户地址不能为空"),
    LOGIN_SUCCESSUPDATEPWD(0,"信息修改成功"),
   
    
    
    
    MACHINE_UNID(201,"农机id不能为空"),
    MACHINE_UNACCREDITId(202,"授权id不能为空"),
    MACHINE_UNHANDLEId(202,"移交id不能为空"),
    MACHINE_NOACCREDITCODE(203,"授权码无效"),
    MACHINE_NOHANDLECODE(203,"移交码无效"),
    MACHINE_OUTTIME(204,"授权码已过期，请联系记住重新生成授权码"),
    MACHINE_OUTTIMEH(204,"移交码已过期，请联系记住重新生成移交码"),
    MACHINE_SUCCESSACCREDIT(0,"授权成功"),
    MACHINE_SUCCESSHANDLEOVER(0,"移交成功"),
    MACHINE_SUCCESSADD(0,"添加设备成功"),
    MACHINE_FAILACCREDIT(206,"授权失败"),
    MACHINE_UNTIME(207,"开始时间不能为空"),
    MACHINE_ACCREDITED(208,"绑定失败,你已是该农机的机主或者机手"),
    MACHINE_SUCCESSCANCELACCREDIT(0,"取消授权成功"),
    MACHINE_FAILCANCELACCREDIT(219,"取消授权失败"),
    MACHINE_PARAM_ERROR(211,"查询参数错误"),
    MACHINE_UNPARAM(212,"请求参数不能为空"),
    MACHINE_FAULTPARAM(213,"请求参数不能为空"),
    MACHINE_UNAUTHORITY(214,"没有权限执行该操作"),
    MACHINE_FAILHANDLEOVER(215,"移交失败"),
    MACHINE_UNIMEI(216,"imei不能为空"),
    MACHINE_FAILADDMACHINE(217,"绑定设备失败"),
    MACHINE_NOMACHINE(218,"没有可添加的农机设备"),
    USER_UNMACHINE(219,"你没有权限查看该农机"),
    MACHINE_SAMEIMEI(220,"imei已被占用"),
    
    
    
    
    ORDER_UNORDERID(300,"订单id不能为空"),
    ORDER_UNPHONE(301,"联系电话不能为空"),
    ORDER_UNMAN(302,"联系人不能为空"),
    ORDER_UNAREACODE(303,"请填写作业区域"),
    ORDER_UNADDR(304,"请填写详细地址"),
    ORDER_UNSEEDVARIETY(306,"请填写作业品种"),
    ORDER_UNWORKTYPE(307,"请填写作业类型"),
    ORDER_UNWORKAREA(308,"请填写作业区域"),
    ORDER_UNPARCELDISTRIBUTION(309,"请填写作业品种"),
    ORDER_UNWORKTIME(310,"请填写作业时间"),
    ORDER_UNREMARK(311,"请填写备注信息"),
    ORDER_FAILADD(312,"发布失败"),
    ORDER_SUCCESSADD(0,"发布成功"),
    
    
    
    FEEDBACK_UNCONTENT(510,"反馈内容不能为空"),
    FEEDBACK_SUCCESSADD(0,"反馈成功"),
    FEEDBACK_FAILADD(1,"反馈失败"),
    
    
    
    PIC_FAILUPLOAD(1,"反馈失败"),
    PIC_UNPIC(601,"请选择上传的图片"),
    
    
    
    
    DATA_FAULTMACHINEID(40,"农机id参数错误"),

    
    FAIL_IMEI_NO_SAVE(401,"imei不存在"),
    FAIL_DBTABLE_NO_SAVE(402,"没有对应的表"),
    FAIL_DBTABLE_NO_DATA(403,"db表中沒有数据"),
    
    PAGE_FAULTPARAM(603,"分页参数错误"),
	
    UNCODE(9998,"非法的二维码"),
	UNNETWORK(500,"当前网络不稳定,请稍后再试"),
	LOGIN_USED(9999,"你的设备在另外一台设备登录，请重新登录");
    private Constants(int index, String msg){
        this.index=index;
        this.msg = msg;
    }
    private String msg;
    private int index;
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

}