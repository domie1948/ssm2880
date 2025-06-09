const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmljssk/",
            name: "ssmljssk",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmljssk/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "疫情期间社区出入管理系统"
        } 
    }
}
export default base
