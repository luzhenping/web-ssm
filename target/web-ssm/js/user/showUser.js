$(function(){
    $("#userTable").jqGrid({
        ajaxGridOptions : {type:"POST"},
        serializeGridData : function(postdata) {
            postdata.page = 1;
            return postdata;
        },
        url:'../user/showUser',
        datatype: "json",
        colNames:['id','userName', 'userPhone', 'userEmail', 'userPwd"','pwdSalt','createTime','modifyTime','isDelete'],
        colModel:[
            {name:'id',index:'id', width:55},
            {name:'userName',index:'user_name', width:90},
            {name:'userPhone',index:'user_phone', width:100},
            {name:'userEmail',index:'user_email', width:80, align:"right"},
            {name:'userPwd',index:'user_pwd', width:80, align:"right"},
            {name:'pwdSalt',index:'pwd_salt', width:80,align:"right"},
            {name:'createTime',index:'create_time', width:150, sortable:false},
            {name:'modifyTime',index:'modify_time', width:150, sortable:false},
            {name:'isDelete',index:'is_delete', width:150, sortable:false}
        ],
        rowNum:10,
        width:700,
        rowList:[10,20,30],
        pager: '#userPage',
        sortname: 'id',
        viewrecords: true,
        sortorder: "desc",
        caption:"query user list"
    });
    $("#userTable").jqGrid('navGrid','#userPage',{edit:true,add:true,del:true});
})
