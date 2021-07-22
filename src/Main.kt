fun main() {
    print(variableName("myVariable"))
}

fun variableName(name: String): Boolean {
    if(name[0]>='a' && name[0]<='z' || name[0]>='A' && name[0]<='Z'||name[0]=='_'){
        for(i in 0 until name.length){
            if(name[i]>='a' && name[i]<='z' || name[i]>='A' && name[i]<='Z' ||name[i]=='_' || name[i]>='0' && name[i]<='9')
                continue
            else return false
        }
        return true            }

    else
        return false
}
