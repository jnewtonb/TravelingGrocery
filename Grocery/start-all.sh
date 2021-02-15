for d in ./*/ ; do (cd "$d" && mvn liberty:run&); done 
