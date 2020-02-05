// pages/boss/cha_pwd/cha_pwd.js
const UPDATE_PWD = 'http://localhost:8081/managers_update_pwd';
Page({

    /**
     * 页面的初始数据
     */
    data: {
      name:'',
      old_pwd:'',
      new_pwd:'',
      new_pwd2:''
    },
    getForm: function(e){
      this.setData({
        old_pwd: e.detail.value.old_pwd,
        new_pwd: e.detail.value.new_pwd,
        new_pwd2: e.detail.value.new_pwd2
      })
      console.log(this.data)
      var key = this.data.new_pwd;
      var key2 = this.data.new_pwd2;
      var key3 = this.data.old_pwd;
      console.log(this.data.name)
      var that = this;
      if (key.length > 16 || key.length < 8) {
        wx.showModal({
          title: '提示',
          content: '密码长度必须大于8且小于16',
        })
      } else if (key != key2) {
        wx.showModal({
          title: '提示',
          content: '两次新密码不相同',
        })
      } else if(key == key3 || key2 == key3){
        wx.showModal({
          title: '提示',
          content: '新密码与旧密码相同',
        })
      }else{
        that.submission();
      }
    },
    submission: function(){
      console.log(this.data)
      wx.request({
        url: UPDATE_PWD,
        method: 'post',
        header: {
          "Content-Type": "application/x-www-form-urlencoded"
        },
        data: {
          name: this.data.name,
          old_pwd: this.data.old_pwd,
          new_pwd: this.data.new_pwd,
        },
        success: (data) => {
          console.log(data)
          if (data.data == "error") {
            wx.showModal({
              title: '提示',
              content: '旧密码错误',
            })
          } else if (data.data == "success") {
            wx.showModal({
              title: '修改成功',
              content: '请重新登录',
            })
            wx.redirectTo({
              url: '../../index/index',
            })
          }
        }
      })
    },
    /**
     * 生命周期函数--监听页面加载
     */
    onLoad: function (options) {
      console.log(options);
      this.setData({
        name: 'shiyue'
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

    },
    /**
     * 取消操作，返回上级页面
     */
    
    clear:function(res){
      this.setData({
        'inputValue': ''
      })
    },
})