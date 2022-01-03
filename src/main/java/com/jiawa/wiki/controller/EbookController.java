package com.jiawa.wiki.controller;

import com.jiawa.wiki.req.EbookQueryReq;
import com.jiawa.wiki.resp.CommonResp;
import com.jiawa.wiki.resp.EbookQueryResp;
import com.jiawa.wiki.service.EbookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/ebook")
public class EbookController {


    @Resource
    private EbookService ebookService;
    
    @GetMapping("/list")
    public CommonResp<List<EbookQueryResp>> list(EbookQueryReq req){
        List<EbookQueryResp> list = ebookService.list(req);

        CommonResp<List<EbookQueryResp>> commonResp = new CommonResp<>();
        commonResp.setContent(list);
        return commonResp;
    }
}
