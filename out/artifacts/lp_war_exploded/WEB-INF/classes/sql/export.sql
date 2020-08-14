#sql("exportQaList")
   select  ques_content,
           ques_from,
           ans_type,
           ans_content,
           creatime,
           effective
    from qa_library
    #if(search_param)
      where qa_library.ques_content like concat('%',#para(search_param),'%')
    #end
    ORDER BY qa_library.creatime desc

#end