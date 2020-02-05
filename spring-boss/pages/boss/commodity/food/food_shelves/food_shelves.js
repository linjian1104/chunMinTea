// pages/boss/commodity/food/food_shelves/food_shelves.js
const FOOD_ADD_URL = 'http://localhost:9010/allcontent/add';
Page({

  /**
   * 页面的初始数据
   */
  data: {
    type: 'snack',
    image: '',
    name: '',
    count: '',
    price: ''
  },
  getForm: function (e) {
    var formdata = e.detail.value;
    this.setData({
      "data.image": formdata.image,
      "data.name": formdata.name,
      "data.count": formdata.count,
      "data.price": formdata.price,
    })
    console.log("更新data", e)
    var that = this;
    wx.showModal({
      title: '提示',
      content: '是否确认添加',
      success: function (res) {
        if (res.confirm) {
          console.log("用户点击确认")
          that.add();
        } else if (res.cancel) {
          console, log("用户点击取消")
        }
      }
    })
  },
  add: function () {
    console.log(this.data.type)
    wx.request({
      url: FOOD_ADD_URL,
      method: 'POST',
      header: {
        "Content-Type": "application/x-www-form-urlencoded"
      },
      data: {
        type: this.data.type,
        image: this.data.data.image,
        name: this.data.data.name,
        count: this.data.data.count,
        price: this.data.data.price
      },
      success: (data) => {
        console.log(data)
        // data.data == "success" ? console.log("修改成功") : console.log("修改失败");
        if (data.data != "success") {
          console.log("添加失败")
        } else {
          wx.showModal({
            title: '添加成功',
            content: '是否返回上级页面',
            success(res) {
              if (res.confirm) {
                console.log("用户点击确认")
                wx.redirectTo({
                  url: '../food',
                })
              } else if (res.cancel) {
                console.log("用户点击取消")
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