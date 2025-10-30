.class public final LA3/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA3/i;


# instance fields
.field public final synthetic a:I

.field public b:Z

.field public c:J

.field public d:I

.field public e:I

.field public final f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x1

    iput v0, p0, LA3/h;->a:I

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    new-instance v0, LA4/r;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, LA4/r;-><init>(I)V

    iput-object v0, p0, LA3/h;->f:Ljava/lang/Object;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 7
    iput-wide v0, p0, LA3/h;->c:J

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, LA3/h;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LA3/h;->f:Ljava/lang/Object;

    .line 3
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    new-array p1, p1, [Lq3/u;

    iput-object p1, p0, LA3/h;->g:Ljava/lang/Object;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    iput-wide v0, p0, LA3/h;->c:J

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget v0, p0, LA3/h;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, LA3/h;->b:Z

    .line 8
    .line 9
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    iput-wide v0, p0, LA3/h;->c:J

    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_0
    const/4 v0, 0x0

    .line 18
    iput-boolean v0, p0, LA3/h;->b:Z

    .line 19
    .line 20
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    iput-wide v0, p0, LA3/h;->c:J

    .line 26
    .line 27
    return-void

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 30
    .line 31
    .line 32
.end method

.method public final c(LA4/r;)V
    .locals 8

    .line 1
    iget v0, p0, LA3/h;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LA3/h;->g:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lq3/u;

    .line 9
    .line 10
    invoke-static {v0}, Ll4/a;->n(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iget-boolean v0, p0, LA3/h;->b:Z

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto :goto_2

    .line 18
    :cond_0
    invoke-virtual {p1}, LA4/r;->e()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget v1, p0, LA3/h;->e:I

    .line 23
    .line 24
    const/16 v2, 0xa

    .line 25
    .line 26
    if-ge v1, v2, :cond_3

    .line 27
    .line 28
    rsub-int/lit8 v1, v1, 0xa

    .line 29
    .line 30
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    iget-object v3, p1, LA4/r;->c:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v3, [B

    .line 37
    .line 38
    iget v4, p1, LA4/r;->a:I

    .line 39
    .line 40
    iget-object v5, p0, LA3/h;->f:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v5, LA4/r;

    .line 43
    .line 44
    iget-object v6, v5, LA4/r;->c:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v6, [B

    .line 47
    .line 48
    iget v7, p0, LA3/h;->e:I

    .line 49
    .line 50
    invoke-static {v3, v4, v6, v7, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 51
    .line 52
    .line 53
    iget v3, p0, LA3/h;->e:I

    .line 54
    .line 55
    add-int/2addr v3, v1

    .line 56
    if-ne v3, v2, :cond_3

    .line 57
    .line 58
    const/4 v1, 0x0

    .line 59
    invoke-virtual {v5, v1}, LA4/r;->H(I)V

    .line 60
    .line 61
    .line 62
    const/16 v3, 0x49

    .line 63
    .line 64
    invoke-virtual {v5}, LA4/r;->x()I

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    if-ne v3, v4, :cond_2

    .line 69
    .line 70
    const/16 v3, 0x44

    .line 71
    .line 72
    invoke-virtual {v5}, LA4/r;->x()I

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    if-ne v3, v4, :cond_2

    .line 77
    .line 78
    const/16 v3, 0x33

    .line 79
    .line 80
    invoke-virtual {v5}, LA4/r;->x()I

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    if-eq v3, v4, :cond_1

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_1
    const/4 v1, 0x3

    .line 88
    invoke-virtual {v5, v1}, LA4/r;->I(I)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v5}, LA4/r;->w()I

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    add-int/2addr v1, v2

    .line 96
    iput v1, p0, LA3/h;->d:I

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_2
    :goto_0
    const-string p1, "Id3Reader"

    .line 100
    .line 101
    const-string v0, "Discarding invalid ID3 tag"

    .line 102
    .line 103
    invoke-static {p1, v0}, Ll4/a;->P(Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    iput-boolean v1, p0, LA3/h;->b:Z

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_3
    :goto_1
    iget v1, p0, LA3/h;->d:I

    .line 110
    .line 111
    iget v2, p0, LA3/h;->e:I

    .line 112
    .line 113
    sub-int/2addr v1, v2

    .line 114
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    iget-object v1, p0, LA3/h;->g:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v1, Lq3/u;

    .line 121
    .line 122
    invoke-interface {v1, v0, p1}, Lq3/u;->c(ILA4/r;)V

    .line 123
    .line 124
    .line 125
    iget p1, p0, LA3/h;->e:I

    .line 126
    .line 127
    add-int/2addr p1, v0

    .line 128
    iput p1, p0, LA3/h;->e:I

    .line 129
    .line 130
    :goto_2
    return-void

    .line 131
    :pswitch_0
    iget-boolean v0, p0, LA3/h;->b:Z

    .line 132
    .line 133
    if-eqz v0, :cond_b

    .line 134
    .line 135
    iget v0, p0, LA3/h;->d:I

    .line 136
    .line 137
    const/4 v1, 0x2

    .line 138
    const/4 v2, 0x0

    .line 139
    const/4 v3, 0x1

    .line 140
    if-ne v0, v1, :cond_6

    .line 141
    .line 142
    invoke-virtual {p1}, LA4/r;->e()I

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    if-nez v0, :cond_4

    .line 147
    .line 148
    move v0, v2

    .line 149
    goto :goto_3

    .line 150
    :cond_4
    invoke-virtual {p1}, LA4/r;->x()I

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    const/16 v1, 0x20

    .line 155
    .line 156
    if-eq v0, v1, :cond_5

    .line 157
    .line 158
    iput-boolean v2, p0, LA3/h;->b:Z

    .line 159
    .line 160
    :cond_5
    iget v0, p0, LA3/h;->d:I

    .line 161
    .line 162
    sub-int/2addr v0, v3

    .line 163
    iput v0, p0, LA3/h;->d:I

    .line 164
    .line 165
    iget-boolean v0, p0, LA3/h;->b:Z

    .line 166
    .line 167
    :goto_3
    if-nez v0, :cond_6

    .line 168
    .line 169
    goto :goto_6

    .line 170
    :cond_6
    iget v0, p0, LA3/h;->d:I

    .line 171
    .line 172
    if-ne v0, v3, :cond_9

    .line 173
    .line 174
    invoke-virtual {p1}, LA4/r;->e()I

    .line 175
    .line 176
    .line 177
    move-result v0

    .line 178
    if-nez v0, :cond_7

    .line 179
    .line 180
    move v0, v2

    .line 181
    goto :goto_4

    .line 182
    :cond_7
    invoke-virtual {p1}, LA4/r;->x()I

    .line 183
    .line 184
    .line 185
    move-result v0

    .line 186
    if-eqz v0, :cond_8

    .line 187
    .line 188
    iput-boolean v2, p0, LA3/h;->b:Z

    .line 189
    .line 190
    :cond_8
    iget v0, p0, LA3/h;->d:I

    .line 191
    .line 192
    sub-int/2addr v0, v3

    .line 193
    iput v0, p0, LA3/h;->d:I

    .line 194
    .line 195
    iget-boolean v0, p0, LA3/h;->b:Z

    .line 196
    .line 197
    :goto_4
    if-nez v0, :cond_9

    .line 198
    .line 199
    goto :goto_6

    .line 200
    :cond_9
    iget v0, p1, LA4/r;->a:I

    .line 201
    .line 202
    invoke-virtual {p1}, LA4/r;->e()I

    .line 203
    .line 204
    .line 205
    move-result v1

    .line 206
    iget-object v3, p0, LA3/h;->g:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast v3, [Lq3/u;

    .line 209
    .line 210
    array-length v4, v3

    .line 211
    :goto_5
    if-ge v2, v4, :cond_a

    .line 212
    .line 213
    aget-object v5, v3, v2

    .line 214
    .line 215
    invoke-virtual {p1, v0}, LA4/r;->H(I)V

    .line 216
    .line 217
    .line 218
    invoke-interface {v5, v1, p1}, Lq3/u;->c(ILA4/r;)V

    .line 219
    .line 220
    .line 221
    add-int/lit8 v2, v2, 0x1

    .line 222
    .line 223
    goto :goto_5

    .line 224
    :cond_a
    iget p1, p0, LA3/h;->e:I

    .line 225
    .line 226
    add-int/2addr p1, v1

    .line 227
    iput p1, p0, LA3/h;->e:I

    .line 228
    .line 229
    :cond_b
    :goto_6
    return-void

    .line 230
    nop

    .line 231
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final d()V
    .locals 11

    .line 1
    iget v0, p0, LA3/h;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LA3/h;->g:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lq3/u;

    .line 9
    .line 10
    invoke-static {v0}, Ll4/a;->n(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iget-boolean v0, p0, LA3/h;->b:Z

    .line 14
    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    iget v5, p0, LA3/h;->d:I

    .line 18
    .line 19
    if-eqz v5, :cond_2

    .line 20
    .line 21
    iget v0, p0, LA3/h;->e:I

    .line 22
    .line 23
    if-eq v0, v5, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget-wide v2, p0, LA3/h;->c:J

    .line 27
    .line 28
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    cmp-long v0, v2, v0

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    iget-object v0, p0, LA3/h;->g:Ljava/lang/Object;

    .line 38
    .line 39
    move-object v1, v0

    .line 40
    check-cast v1, Lq3/u;

    .line 41
    .line 42
    const/4 v7, 0x0

    .line 43
    const/4 v4, 0x1

    .line 44
    const/4 v6, 0x0

    .line 45
    invoke-interface/range {v1 .. v7}, Lq3/u;->d(JIIILq3/t;)V

    .line 46
    .line 47
    .line 48
    :cond_1
    const/4 v0, 0x0

    .line 49
    iput-boolean v0, p0, LA3/h;->b:Z

    .line 50
    .line 51
    :cond_2
    :goto_0
    return-void

    .line 52
    :pswitch_0
    iget-boolean v0, p0, LA3/h;->b:Z

    .line 53
    .line 54
    if-eqz v0, :cond_4

    .line 55
    .line 56
    iget-wide v0, p0, LA3/h;->c:J

    .line 57
    .line 58
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    cmp-long v0, v0, v2

    .line 64
    .line 65
    const/4 v1, 0x0

    .line 66
    if-eqz v0, :cond_3

    .line 67
    .line 68
    iget-object v0, p0, LA3/h;->g:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v0, [Lq3/u;

    .line 71
    .line 72
    array-length v2, v0

    .line 73
    move v3, v1

    .line 74
    :goto_1
    if-ge v3, v2, :cond_3

    .line 75
    .line 76
    aget-object v4, v0, v3

    .line 77
    .line 78
    iget-wide v5, p0, LA3/h;->c:J

    .line 79
    .line 80
    iget v8, p0, LA3/h;->e:I

    .line 81
    .line 82
    const/4 v10, 0x0

    .line 83
    const/4 v7, 0x1

    .line 84
    const/4 v9, 0x0

    .line 85
    invoke-interface/range {v4 .. v10}, Lq3/u;->d(JIIILq3/t;)V

    .line 86
    .line 87
    .line 88
    add-int/lit8 v3, v3, 0x1

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_3
    iput-boolean v1, p0, LA3/h;->b:Z

    .line 92
    .line 93
    :cond_4
    return-void

    .line 94
    nop

    .line 95
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
.end method

.method public final e(JI)V
    .locals 2

    .line 1
    iget v0, p0, LA3/h;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    and-int/lit8 p3, p3, 0x4

    .line 7
    .line 8
    if-nez p3, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p3, 0x1

    .line 12
    iput-boolean p3, p0, LA3/h;->b:Z

    .line 13
    .line 14
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    cmp-long p3, p1, v0

    .line 20
    .line 21
    if-eqz p3, :cond_1

    .line 22
    .line 23
    iput-wide p1, p0, LA3/h;->c:J

    .line 24
    .line 25
    :cond_1
    const/4 p1, 0x0

    .line 26
    iput p1, p0, LA3/h;->d:I

    .line 27
    .line 28
    iput p1, p0, LA3/h;->e:I

    .line 29
    .line 30
    :goto_0
    return-void

    .line 31
    :pswitch_0
    and-int/lit8 p3, p3, 0x4

    .line 32
    .line 33
    if-nez p3, :cond_2

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_2
    const/4 p3, 0x1

    .line 37
    iput-boolean p3, p0, LA3/h;->b:Z

    .line 38
    .line 39
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    cmp-long p3, p1, v0

    .line 45
    .line 46
    if-eqz p3, :cond_3

    .line 47
    .line 48
    iput-wide p1, p0, LA3/h;->c:J

    .line 49
    .line 50
    :cond_3
    const/4 p1, 0x0

    .line 51
    iput p1, p0, LA3/h;->e:I

    .line 52
    .line 53
    const/4 p1, 0x2

    .line 54
    iput p1, p0, LA3/h;->d:I

    .line 55
    .line 56
    :goto_1
    return-void

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
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
.end method

.method public final f(Lq3/l;LA3/I;)V
    .locals 6

    .line 1
    iget v0, p0, LA3/h;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, LA3/I;->a()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p2}, LA3/I;->b()V

    .line 10
    .line 11
    .line 12
    iget v0, p2, LA3/I;->d:I

    .line 13
    .line 14
    const/4 v1, 0x5

    .line 15
    invoke-interface {p1, v0, v1}, Lq3/l;->u(II)Lq3/u;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, LA3/h;->g:Ljava/lang/Object;

    .line 20
    .line 21
    new-instance v0, Lj3/L;

    .line 22
    .line 23
    invoke-direct {v0}, Lj3/L;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p2}, LA3/I;->b()V

    .line 27
    .line 28
    .line 29
    iget-object p2, p2, LA3/I;->e:Ljava/lang/String;

    .line 30
    .line 31
    iput-object p2, v0, Lj3/L;->a:Ljava/lang/String;

    .line 32
    .line 33
    const-string p2, "application/id3"

    .line 34
    .line 35
    iput-object p2, v0, Lj3/L;->k:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/k1;->u(Lj3/L;Lq3/u;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :pswitch_0
    const/4 v0, 0x0

    .line 42
    :goto_0
    iget-object v1, p0, LA3/h;->g:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v1, [Lq3/u;

    .line 45
    .line 46
    array-length v2, v1

    .line 47
    if-ge v0, v2, :cond_0

    .line 48
    .line 49
    iget-object v2, p0, LA3/h;->f:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v2, Ljava/util/List;

    .line 52
    .line 53
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    check-cast v2, LA3/H;

    .line 58
    .line 59
    invoke-virtual {p2}, LA3/I;->a()V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p2}, LA3/I;->b()V

    .line 63
    .line 64
    .line 65
    iget v3, p2, LA3/I;->d:I

    .line 66
    .line 67
    const/4 v4, 0x3

    .line 68
    invoke-interface {p1, v3, v4}, Lq3/l;->u(II)Lq3/u;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    new-instance v4, Lj3/L;

    .line 73
    .line 74
    invoke-direct {v4}, Lj3/L;-><init>()V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p2}, LA3/I;->b()V

    .line 78
    .line 79
    .line 80
    iget-object v5, p2, LA3/I;->e:Ljava/lang/String;

    .line 81
    .line 82
    iput-object v5, v4, Lj3/L;->a:Ljava/lang/String;

    .line 83
    .line 84
    const-string v5, "application/dvbsubs"

    .line 85
    .line 86
    iput-object v5, v4, Lj3/L;->k:Ljava/lang/String;

    .line 87
    .line 88
    iget-object v5, v2, LA3/H;->b:[B

    .line 89
    .line 90
    invoke-static {v5}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    iput-object v5, v4, Lj3/L;->m:Ljava/util/List;

    .line 95
    .line 96
    iget-object v2, v2, LA3/H;->a:Ljava/lang/String;

    .line 97
    .line 98
    iput-object v2, v4, Lj3/L;->c:Ljava/lang/String;

    .line 99
    .line 100
    invoke-static {v4, v3}, Lcom/google/android/gms/internal/measurement/k1;->u(Lj3/L;Lq3/u;)V

    .line 101
    .line 102
    .line 103
    aput-object v3, v1, v0

    .line 104
    .line 105
    add-int/lit8 v0, v0, 0x1

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_0
    return-void

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
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
.end method
