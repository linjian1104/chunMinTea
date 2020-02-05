// pages/index/register/register.js
// const ADD_MANAGERS = 'http://localhost:8081/addManagers';
const ADD_URL = 'http://localhost:8090/managers/add'
Page({

  /**
   * 页面的初始数据
   */
  data: {
    name:'',
    telephone:'',
    invite:'',
    password:'',
    password2:''
  },
  getForm: function(e){  
    this.setData({
      name: e.detail.value.name,
      telephone: e.detail.value.telephone,
      invite: e.detail.value.invite,
      password: e.detail.value.password,
      password2: e.detail.value.password2
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
    var that = this;
    var key = this.data.password;
    var key2 = this.data.password2
    console.log(key)
    if(key.length > 16 || key.length < 8){
      wx.showModal({
        title: '提示',
        content: '密码长度必须大于8且小于16',
      })
    }else if(key != key2){
      wx.showToast({
        title: '两次密码不相同',
      })
    }else {
      that.submission();
    }
    console.log(this.data)
  },
  submission: function(){
    wx.request({
      url: ADD_URL,
      method: 'post',
      header: {
        "Content-Type": "application/x-www-form-urlencoded"
      },
      data: {
        name: this.data.name,
        telephone: this.data.telephone,
        // invite: this.data.invite,
        password: this.data.password,
      },
      success:(data)=>{
        if(data.data == "error"){
          wx.showModal({
            title: '提示',
            content: '邀请码输入错误或已失效',
          })
        }else if (data.data == "success"){
          wx.showToast({
            title: '注册成功'
          })
          wx.redirectTo({
            url: '../index',
          })
        }
      }
    })
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