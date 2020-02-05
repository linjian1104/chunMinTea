// pages/boss/commodity/house/house.js
const HOUSE_URL = 'http://localhost:9010/allcontent/all';
var app = getApp();
Page({

  /**
   * 页面的初始数据
   */
  data: {
    type: 'house',
    commoditysArr: [],
  },

  /**
   * 生命周期函数--监听页面加载
   */
  //调用查询方法获取全部房间
  onLoad: function (options) {
    wx.request({
      url: HOUSE_URL,
      method: 'POST',
      header: {
        "Content-Type": "application/x-www-form-urlencoded"
      },
      data: {
        type: this.data.type
      },
      success: (data) => {
        console.log(data);
        //更新状态值
        this.setData({
          commoditysArr: data.data
        })

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

  }
})