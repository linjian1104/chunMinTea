// pages/staff/staff.js
//原始地址
// const STAFF_URL = 'http://localhost:8081/users';
//分布式搭建后地址
const STAFF_URL = 'http://localhost:9000/invoking/user/all';
const SEARCH_URL = 'http://localhost:8081/joinuser/search';
let appDatas = getApp();
Page({

    /**
     * 页面的初始数据
     */
    data: {
      message:'',
      usersArr:[],
      containershow: true
    },
    //搜索框聚焦事件
    close: function(e){
      this.setData({
        containershow: false
      })
    },
    close_: function(e){
      this.setData({
        message: e.detail.value
      })
      console.log(this.data.message)
    },
  //即时索引
  searchInput: function (e) {
    this.setData({
      keyWord: e.detail.value
    })
    console.log(this.data.keyWord)
    wx.request({
      url: SEARCH_URL,
      method: 'POST',
      header: {
        "Content-Type": "application/x-www-form-urlencoded"
      },
      data: {
        keyWord: this.data.keyWord
      },
      success: (data) => {
        console.log(data);
        //更新状态值
        this.setData({
          searchArr: data.data
        })
        
      }
    })
  },
    //显示主页面
    clear: function(){
      this.setData({
        containershow:true
      })
    },
    /**
     * 生命周期函数--监听页面加载
     */
    onLoad: function (options) {
      wx.request({
        url:STAFF_URL,
        success:(data) =>{
          console.log(data);
          //更新状态值
          this.setData({
            usersArr:data.data
          })
          appDatas.data.usersArr = data.data;
        }
      })
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
     * 进入添加员工页面
     */
    addStaff: function () {
      wx.redirectTo({
            url: 'addStaff/addStaff',
        })
    } 
})