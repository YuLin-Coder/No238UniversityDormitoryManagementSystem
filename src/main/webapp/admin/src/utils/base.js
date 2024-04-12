const base = {
    get() {
                return {
            url : "http://localhost:8080/ssmw3131/",
            name: "ssmw3131",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmw3131/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "高校宿舍管理系统"
        } 
    }
}
export default base
