.class public abstract LF0/Z;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:LF0/Q;

.field public b:Ljava/util/ArrayList;

.field public c:J

.field public d:J

.field public e:J

.field public f:J


# direct methods
.method public static b(LF0/r0;)V
    .locals 2

    .line 1
    iget v0, p0, LF0/r0;->j:I

    .line 2
    .line 3
    invoke-virtual {p0}, LF0/r0;->g()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    and-int/lit8 v0, v0, 0x4

    .line 11
    .line 12
    if-nez v0, :cond_2

    .line 13
    .line 14
    iget-object v0, p0, LF0/r0;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 15
    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/RecyclerView;->K(LF0/r0;)I

    .line 20
    .line 21
    .line 22
    :cond_2
    :goto_0
    return-void
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method


# virtual methods
.method public abstract a(LF0/r0;LF0/r0;LF0/Y;LF0/Y;)Z
.end method

.method public final c(LF0/r0;)V
    .locals 9

    .line 1
    iget-object v0, p0, LF0/Z;->a:LF0/Q;

    .line 2
    .line 3
    if-eqz v0, :cond_8

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {p1, v1}, LF0/r0;->o(Z)V

    .line 7
    .line 8
    .line 9
    iget-object v2, p1, LF0/r0;->h:LF0/r0;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    iget-object v2, p1, LF0/r0;->i:LF0/r0;

    .line 15
    .line 16
    if-nez v2, :cond_0

    .line 17
    .line 18
    iput-object v3, p1, LF0/r0;->h:LF0/r0;

    .line 19
    .line 20
    :cond_0
    iput-object v3, p1, LF0/r0;->i:LF0/r0;

    .line 21
    .line 22
    iget v2, p1, LF0/r0;->j:I

    .line 23
    .line 24
    and-int/lit8 v2, v2, 0x10

    .line 25
    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    goto/16 :goto_4

    .line 29
    .line 30
    :cond_1
    iget-object v0, v0, LF0/Q;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 31
    .line 32
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->l0()V

    .line 33
    .line 34
    .line 35
    iget-object v2, v0, Landroidx/recyclerview/widget/RecyclerView;->f:LA3/F;

    .line 36
    .line 37
    iget-object v3, v2, LA3/F;->d:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v3, LF0/h;

    .line 40
    .line 41
    iget-object v4, v2, LA3/F;->c:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v4, Lo1/f;

    .line 44
    .line 45
    iget v5, v2, LA3/F;->b:I

    .line 46
    .line 47
    const/4 v6, 0x0

    .line 48
    iget-object v7, p1, LF0/r0;->a:Landroid/view/View;

    .line 49
    .line 50
    if-ne v5, v1, :cond_3

    .line 51
    .line 52
    iget-object v1, v2, LA3/F;->f:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v1, Landroid/view/View;

    .line 55
    .line 56
    if-ne v1, v7, :cond_2

    .line 57
    .line 58
    :goto_0
    move v1, v6

    .line 59
    goto :goto_2

    .line 60
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 61
    .line 62
    const-string v0, "Cannot call removeViewIfHidden within removeView(At) for a different view"

    .line 63
    .line 64
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw p1

    .line 68
    :cond_3
    const/4 v8, 0x2

    .line 69
    if-eq v5, v8, :cond_7

    .line 70
    .line 71
    :try_start_0
    iput v8, v2, LA3/F;->b:I

    .line 72
    .line 73
    iget-object v5, v4, Lo1/f;->b:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v5, Landroidx/recyclerview/widget/RecyclerView;

    .line 76
    .line 77
    invoke-virtual {v5, v7}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    const/4 v8, -0x1

    .line 82
    if-ne v5, v8, :cond_4

    .line 83
    .line 84
    invoke-virtual {v2, v7}, LA3/F;->o(Landroid/view/View;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 85
    .line 86
    .line 87
    :goto_1
    iput v6, v2, LA3/F;->b:I

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :catchall_0
    move-exception p1

    .line 91
    goto :goto_3

    .line 92
    :cond_4
    :try_start_1
    invoke-virtual {v3, v5}, LF0/h;->I(I)Z

    .line 93
    .line 94
    .line 95
    move-result v8

    .line 96
    if-eqz v8, :cond_5

    .line 97
    .line 98
    invoke-virtual {v3, v5}, LF0/h;->K(I)Z

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2, v7}, LA3/F;->o(Landroid/view/View;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v4, v5}, Lo1/f;->K(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 105
    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_5
    iput v6, v2, LA3/F;->b:I

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :goto_2
    if-eqz v1, :cond_6

    .line 112
    .line 113
    invoke-static {v7}, Landroidx/recyclerview/widget/RecyclerView;->N(Landroid/view/View;)LF0/r0;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView;->c:LF0/h0;

    .line 118
    .line 119
    invoke-virtual {v3, v2}, LF0/h0;->l(LF0/r0;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v3, v2}, LF0/h0;->i(LF0/r0;)V

    .line 123
    .line 124
    .line 125
    sget-boolean v2, Landroidx/recyclerview/widget/RecyclerView;->b1:Z

    .line 126
    .line 127
    if-eqz v2, :cond_6

    .line 128
    .line 129
    new-instance v2, Ljava/lang/StringBuilder;

    .line 130
    .line 131
    const-string v3, "after removing animated view: "

    .line 132
    .line 133
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    const-string v3, ", "

    .line 140
    .line 141
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    const-string v3, "RecyclerView"

    .line 152
    .line 153
    invoke-static {v3, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 154
    .line 155
    .line 156
    :cond_6
    xor-int/lit8 v2, v1, 0x1

    .line 157
    .line 158
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->n0(Z)V

    .line 159
    .line 160
    .line 161
    if-nez v1, :cond_8

    .line 162
    .line 163
    invoke-virtual {p1}, LF0/r0;->k()Z

    .line 164
    .line 165
    .line 166
    move-result p1

    .line 167
    if-eqz p1, :cond_8

    .line 168
    .line 169
    invoke-virtual {v0, v7, v6}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    .line 170
    .line 171
    .line 172
    return-void

    .line 173
    :goto_3
    iput v6, v2, LA3/F;->b:I

    .line 174
    .line 175
    throw p1

    .line 176
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 177
    .line 178
    const-string v0, "Cannot call removeViewIfHidden within removeViewIfHidden"

    .line 179
    .line 180
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    throw p1

    .line 184
    :cond_8
    :goto_4
    return-void
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
.end method

.method public abstract d(LF0/r0;)V
.end method

.method public abstract e()V
.end method

.method public abstract f()Z
.end method
