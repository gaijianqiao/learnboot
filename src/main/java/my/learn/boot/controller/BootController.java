package my.learn.boot.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
@Api(value = "my first swagger program",tags = {"my swagger test"})
@Controller
public class BootController {
    @ApiOperation("one get request")
    @ResponseBody
    @RequestMapping(value = "/hello",method = RequestMethod.GET )
    public String hello()
    {
        return "hello boot";
    }

    @ApiOperation("a post request, it will say hell to the name you sended.")
    @ApiImplicitParams(
            @ApiImplicitParam(name="name",value = "名称",dataType = "string",required = false,paramType = "query")
    )
    @ResponseBody
    @RequestMapping(value = "/sayhello",method = RequestMethod.POST )
    public String say(@RequestParam(value = "name") String myName)
    {
        return "say "+myName+" hello";
    }

}
