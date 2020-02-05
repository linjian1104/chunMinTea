// pages/index/forget_pwd/new_pwd/new_pwd.js

// const UPDATE_PWD = 'http://localhost:8081/updatePwd';

const UPDATE_PWD = 'http://localhost:8090/managers/update';
Page({

  /**
   * 页面的初始数据
   */
  data: {
    telephone: '',
    new_pwd:'',
    new_pwd2:''
  },
  getForm: function(e){
    this.setData({
      new_pwd: e.detail.value.new_pwd,
      new_pwd2: e.detail.value.new_pwd2
    })
    console.log(this.data)
  },
  confirm: function(){
    var num1 = this.data.new_pwd;
    var num2 = this.data.new_pwd2;
    if(num1 != num2){
      wx.showToast({
        title: '两次密码不相同!',
      })
      return false;
    }else{
      var that = this;
      wx.showModal({
        title: '提示',
        content: '确认修改密码',
        success(res) {
          if (res.confirm) {
            console.log("用户点击确认")
            that.update_pwd();
          } else if (res.cancel) {
            console.log("用户点击取消")
          }
        }
      })
    }
  },
  update_pwd: function(){
    console.log(this.data)
    wx.request({
      url: UPDATE_PWD ,
      method: 'POST',
      header:{
        "Content-Type": "application/x-www-form-urlencoded"
      },
      data:{
        telephone: this.data.telephone,
        password: this.data.new_pwd2
      },
      success:(data)=>{
        if (data.data != "success") {
          console.log("修改失败")
          wx.showModal({
            title: '提示',
            content: '修改失败',
          })
        } else {
          wx.showModal({
            title: '修改成功',
            content: '返回登录页面',
            success(res) {
              if (res.confirm) {
                console.log("用户点击确认")
                wx.redirectTo({
                  url: '../../index',
                })
              } else if (res.cancel) {
                console.log("用户点击取消")
                wx.redirectTo({
                  url: '../forget_pwd',
                })
              }
            }
          })
        }
      },
      fail: function () {
        console.log("接口访问失败")
      }
    })
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    console.log(options);
    this.setData({
      telephone: options.telephone
    });
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