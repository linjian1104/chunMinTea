// pages/index/index.js
//原始地址
// const REGISTER_URL = 'http://localhost:8081/register';
//
const LOGIN_URL = 'http://localhost:8090/managers/login'
Page({

    /**
     * 页面的初始数据
     */
    data: {
      name: '',
      password: ''
    },
    getForm:function(e){
      console.log(e)
      var formdata = e.detail.value;
      this.setData({
        "data.name": formdata.name,
        "data.password": formdata.password,
      })
      console.log("更新data", e)
    },
    //申请调用登录验证接口
    record: function(){
      wx.request({
        url: LOGIN_URL,
        method: 'POST',
        header: {
          "Content-Type": "application/x-www-form-urlencoded"
        },
        data:{
          name: this.data.data.name,
          password: this.data.data.password
        },
        success: (data) => {
          console.log(data)
          // data.data == "success" ? console.log("添加成功") : console.log("添加失败");    
          if(data.data == "success"){
            console.log("登陆成功")
            wx.redirectTo({
              url: '../boss/boss?name='+this.data.data.name,
            })
          }else{
            console.log("用户名或密码错误")
            wx.showModal({
              title: '提示',
              content: '用户名或密码错误',
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

    },
    reLoading: function (options) {
        wx.redirectTo({
            url: '../boss/boss',
        })
    }
})