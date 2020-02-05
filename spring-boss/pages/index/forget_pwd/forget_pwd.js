// pages/index/forget_pwd/forget_pwd.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    telephone:'',
    code:'',
    codeTime:'获取验证码',
    containershow: true,
    containershow_: false
  },
  telephoneInput: function (e) {
    this.setData({
      telephone: e.detail.value
    })
  },
  
  switch: function(){
    this.setData({
      containershow: false,
      containershow_: true
    })
    var mobile = this.data.telephone;
    console.log(mobile)
    var regMobile = /^1(3|4|5|7|8)\d{9}$/;
    if (!regMobile.test(mobile)) {
      wx.showToast({
        title: '请输入正确的手机号！',
      })
      return false;
    }
    // app.sendVerifyCode(function () { }, mobile);//获取短信验证码接口
    if(this.data.containershow) return false;
    var that = this;
    var c = 60;
    var intervalId =setInterval(function(){
      c = c-1;
      that.setData({
        codeTime: c+'秒后重发',
        containershow: false,
        containershow_: true
      })
      if(c == 0){
        clearInterval(intervalId);
        that.setData({
          codeTime:'获取验证码',
          containershow: true,
          containershow_: false
        })
      }
    },1000)
    
  },
  codeInput: function (e) {
    this.setData({
      code: e.detail.value
    })
  },
  next: function(){
    console.log("手机号:"+this.data.telephone+"验证码:"+this.data.code)
    // wx.redirectTo({
    //   url: 'new_pwd/new_pwd?telephone={{telephone}}',
    // })
  },
  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {

  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function () {

  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function () {

  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function () {

  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function () {

  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function () {

  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function () {

  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function () {

  }
})