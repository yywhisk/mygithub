<?php
define('USERNAME',"James");
function isJames($username)
{
    if(USERNAME == $username)
    {
        return true;
    }
    return false;
}

var_dump(isJames("james"));
?>