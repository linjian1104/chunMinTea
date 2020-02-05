// pages/boss/boss.js
Page({

    /**
     * 页面的初始数据
     */
    data: {
      name:'',
    },

    /**
     * 生命周期函数--监听页面加载
     */
    onLoad: function (options) {
      console.log(options);
      this.setData({
        name: options.name
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
     * 退出并返回登录页面
     */
    ESC: function () {
        wx.redirectTo({
            url: '../index/index',
        })
    }
    // /**
    //  * 进入员工信息页面
    //  */
    // toStaff: function(){
    //   wx.navigateTo({
    //     url: 'staff/staff',
    //   })
    // },
    // /**
    //  * 进入销售报表页面
    //  */
    // toReportForm: function(){
    //   wx.navigateTo({
    //     url: 'reportForm/reportForm',
    //   })
    // },
    // /**
    //  * 进入商品管理页面
    //  */
    // toCommodity: function(){
    //   wx.navigateTo({
    //     url: 'commodity/commodity',
    //   })
    // }
})