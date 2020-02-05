// pages/boss/commodity/food/food_modify/food_modify.js
// const FOOD_UPDATE_URL = 'http://localhost:8081/updateCommodity';
// const FOOD_DELETE_URL = 'http://localhost:8081/deleteCommodity';
const FOOD_UPDATE_URL = 'http://localhost:9010/allcontent/update';
const FOOD_DELETE_URL = 'http://localhost:9010/allcontent/delete';
const FOOD_GET_URL = 'http://localhost:9010/allcontent/get';
var app = getApp();
console.log(app);
Page({

  /**
   * 页面的初始数据
   */
  data: {
    id: '',
    image: '',
    name: '',
    count: '',
    price: '',
    show_input: false,
    show_input_: true,
    snackDetail: {}
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    console.log(options);
    this.setData({
      snackDetail: app.data.commoditysArr[options.index],
      id: options.id
    })
    wx.request({
      url: FOOD_GET_URL,
      method: 'POST',
      header: {
        "Content-Type": "application/x-www-form-urlencoded"
      },
      data: {
        id: this.data.id
      },
      success: (data) => {
        console.log(data.data)
        this.setData({
          snackDetail: data.data
        })
      }
    })

  },
  update_det: function () {
    this.setData({
      show_input: true,
      show_input_: false,
    })
  },
  update_: function () {
    this.setData({
      show_input: false,
      show_input_: true,
    })
  },
  //获取修改信息表单的信息并提交请求调用后台修改方法
  getForm: function (e) {
    var formdata = e.detail.value;
    this.setData({
      "data.image": formdata.image,
      "data.name": formdata.name,
      "data.count": formdata.count,
      "data.price": formdata.price,
    })
    console.log("更新data", e)
    var that = this
    wx.showModal({
      title: '提示',
      content: '确认保存此次修改',
      success: function (res) {
        if (res.confirm) {
          console.log("用户点击确认")
          that.update();
        } else if (res.cancel) {
          console, log("用户点击取消")
        }
      }
    })
  },
  //修改商品信息的function
  update: function () {
    console.log(this.data.id)
    wx.request({
      url: FOOD_UPDATE_URL,
      method: 'POST',
      header: {
        "Content-Type": "application/x-www-form-urlencoded"
      },
      data: {
        id: this.data.id,
        image: this.data.data.image,
        name: this.data.data.name,
        count: this.data.data.count,
        price: this.data.data.price
      },
      success: (data) => {
        console.log(data)
        // data.data == "success" ? console.log("修改成功") : console.log("修改失败");
        if (data.data != "success") {
          console.log("修改失败")
        } else {
          wx.showModal({
            title: '修改成功',
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
  //请求调用删除方法删除商品
  delete_com: function () {
    wx.request({
      url: FOOD_DELETE_URL,
      data: {
        id: this.data.id
      },
      success: (data) => {
        console.log(data)
        if (data.data != "success") {
          console.log("删除失败")
        } else {
          wx.showModal({
            title: '删除成功',
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