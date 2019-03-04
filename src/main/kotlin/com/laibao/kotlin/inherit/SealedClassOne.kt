package com.laibao.kotlin.inherit

sealed class IntBinaryTree
class EmptyNode : IntBinaryTree()
class IntBinaryTreeNode(val left: IntBinaryTree, val value: Int, val right: IntBinaryTree) : IntBinaryTree()

fun main(args: Array<String>) {
    val tree = IntBinaryTreeNode(IntBinaryTreeNode(EmptyNode(), 1, EmptyNode()), 10, EmptyNode())
}