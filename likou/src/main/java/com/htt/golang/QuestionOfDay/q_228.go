package main

import "fmt"

/**
228. 汇总区间
  给定一个  无重复元素 的 有序 整数数组 nums 。
返回 恰好覆盖数组中所有数字 的 最小有序 区间范围列表 。也就是说，nums 的每个元素都恰好被某个区间范围所覆盖，
并且不存在属于某个范围但不属于 nums 的数字 x 。
列表中的每个区间范围 [a,b] 应该按如下格式输出：
	"a->b" ，如果 a != b
	"a" ，如果 a == b
*/
func main() {
	arr := []int{0, 1, 2, 4, 5, 7}
	summaryRanges(arr)
}

func summaryRanges(nums []int) []string {

	res := make([]string, 0)
	n := len(nums)

	// 快慢指针从索引0开始移动：
	fast := 0
	for fast <= n-1 {
		slow := fast
		// 快指针寻找当前区间范围终点：如果快指针没越界，并且下一个元素与当前元素在同一个区间（当前元素+1=下一个元素），则快指针右移
		for fast <= n-2 && nums[fast]+1 == nums[fast+1] {
			fast++
		}
		// 将[慢指针,快指针]这一区间，转换为字符串后加入结果集
		rangeStr := fmt.Sprintf("%d", nums[slow])
		if slow < fast {
			rangeStr += fmt.Sprintf("->%d", nums[fast])
		}
		res = append(res, rangeStr)
		// 快指针右移一位，进入下一区间的起点
		fast++
	}

	return res
}
