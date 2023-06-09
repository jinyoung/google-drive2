
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import FileManager from "./components/listers/FileCards"
import FileDetail from "./components/listers/FileDetail"

import IndexManager from "./components/listers/IndexCards"
import IndexDetail from "./components/listers/IndexDetail"

import VideoManager from "./components/listers/VideoCards"
import VideoDetail from "./components/listers/VideoDetail"

import NotificationManager from "./components/listers/NotificationCards"
import NotificationDetail from "./components/listers/NotificationDetail"

import DashboardManager from "./components/listers/DashboardCards"
import DashboardDetail from "./components/listers/DashboardDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/files',
                name: 'FileManager',
                component: FileManager
            },
            {
                path: '/files/:id',
                name: 'FileDetail',
                component: FileDetail
            },

            {
                path: '/indices',
                name: 'IndexManager',
                component: IndexManager
            },
            {
                path: '/indices/:id',
                name: 'IndexDetail',
                component: IndexDetail
            },

            {
                path: '/videos',
                name: 'VideoManager',
                component: VideoManager
            },
            {
                path: '/videos/:id',
                name: 'VideoDetail',
                component: VideoDetail
            },

            {
                path: '/notifications',
                name: 'NotificationManager',
                component: NotificationManager
            },
            {
                path: '/notifications/:id',
                name: 'NotificationDetail',
                component: NotificationDetail
            },

            {
                path: '/dashboards',
                name: 'DashboardManager',
                component: DashboardManager
            },
            {
                path: '/dashboards/:id',
                name: 'DashboardDetail',
                component: DashboardDetail
            },



    ]
})
