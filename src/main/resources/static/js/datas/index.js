   jQuery(function($) {
     // デッキ一覧テーブル
     $("#cardtable").DataTable({
       "language": {
           "processing":   "処理中...",
           "lengthMenu":   "_MENU_ 件表示",
           "zeroRecords":  "データはありません。",
           "info":         " _TOTAL_ 件中 _START_ から _END_ まで表示",
           "infoEmpty":    " 0 件中 0 から 0 まで表示",
           "infoFiltered": "（全 _MAX_ 件より抽出）",
           "infoPostFix":  "",
           "search":       "検索:",
           "url":          "",
           "paginate": {
              "first":    "先頭",
              "previous": "前",
              "next":     "次",
              "last":     "最終"
           },
      order: [],
      columnDefs: [
              // 2列目(0から始まるため1になっています)の幅を100pxにする
              { targets: 1, width: 100 }
          ]
     });
   });
