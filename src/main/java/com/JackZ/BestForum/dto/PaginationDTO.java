package com.JackZ.BestForum.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class PaginationDTO<T> {

    private List<T> data;
    private boolean showPrevious;
    private boolean showFirstPage;
    private boolean showNext;
    private boolean showEndPage;
    private Integer page;
    private List<Integer> pages = new ArrayList<>();
    private Integer totalPage;

    public void setPagination(Integer totalSize, Integer size, Integer page) {
        this.totalPage = (int) Math.ceil( ((double) totalSize) / size);
        this.page = Math.max(1, page);
        this.page = Math.min(page, totalPage);
        pages.add(page);
        for (int i = 1; i <= totalPage; ++i) {
            if (Math.abs(page - i) <= 3) {
                pages.add(i);
            }
        }

        showFirstPage = !pages.contains(1);
        showPrevious = page != 1;
        showNext = !page.equals(totalPage);
        showEndPage = !pages.contains(totalPage);
    }

}
