// pages/staff/details/details.js
//原始地址
// const STAFF_URL = 'http://localhost:8081/update';
// const STAFF_URL2 = 'http://localhost:8081/delete';
//分布式搭建后地址
const GET_USER = 'http://localhost:9000//invoking/user/get';
const DELETE_URL = 'http://localhost:9000//invoking/user/delete';
const UPDATE_URL = 'http://localhost:8081/joinuser/update';
let appDatas = getApp();
console.log(appDatas);
Page({

    /**
     * 页面的初始数据
     */
    data: {
      id: '',
      name: '',
      six: '',
      age: '',
      telephone: '',
      cardId: '',
      joinDate: '',
      exitDate: '',
      userDetail: {},
      containershow:true,
      containershow_:false
    },
    update_det: function(){
      this.setData({
        containershow:false,
        containershow_:true
      })
    },
    update_: function(){
      this.setData({
        containershow:true,
        containershow_:false
      })
    },
  //post请求修改员工数据
    //取出input框中的数据
    getForm: function (e) {
      console.log(this.data.id)
      var formdata = e.detail.value;
      this.setData({
        "data.name": formdata.name,
        "data.six": formdata.six,
        "data.age": formdata.age,
        "data.telephone": formdata.telephone,
        "data.cardId": formdata.cardId,
        "data.joinDate": formdata.joinDate,
        "data.exitDate": formdata.exitDate
      })
      console.log("更新data", e)
      
    },
    //请求提交数据执行方法
    update: function(){
      wx.request({
        url: UPDATE_URL,
        method: 'post',
        header: {
          "Content-Type": "application/x-www-form-urlencoded"
        },
        data: {
          id: this.data.id,
          name: this.data.data.name,
          six: this.data.data.six,
          age: this.data.data.age,
          telephone: this.data.data.telephone,
          cardId: this.data.data.cardId,
          joinDate: this.data.data.joinDate,
          exitDate: this.data.data.exitDate
        },
        success: (data) => {
          console.log(data)
          // data.data == "success" ? console.log("修改成功") : console.log("修改失败");  
          if(data.data != "success"){
            console.log("修改失败")
          }else{
            wx.showModal({
              title: '修改成功',
              content: '是否返回上级页面',
              success(res) {
                if (res.confirm) {
                  console.log("用户点击确认")
                  wx.redirectTo({
                    url: '../staff',
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
  //请求删除员工
    delete_: function(){
      console.log(this.data.id)
      wx.request({
        url: DELETE_URL,
        method: 'POST',
        header: {
          "Content-Type": "application/x-www-form-urlencoded"
        },
        data:{
          id: this.data.id
        },
        success: (data) => {
          console.log(data)
          // data.data == "success" ? console.log("删除成功") : console.log("删除失败");
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
                    url: '../staff',
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
      console.log(options);
      this.setData({
        id: options.id
      }),
      wx.request({
        url: GET_USER,
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
            userDetail: data.data
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