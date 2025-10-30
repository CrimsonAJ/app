.class public final LA3/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq3/j;


# instance fields
.field public final a:LA3/e;

.field public final b:LA4/r;

.field public final c:LA4/r;

.field public final d:LZ3/f;

.field public e:Lq3/l;

.field public f:J

.field public g:J

.field public h:Z

.field public i:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LA3/e;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-direct {v0, v1, v2}, LA3/e;-><init>(Ljava/lang/String;Z)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, LA3/d;->a:LA3/e;

    .line 12
    .line 13
    new-instance v0, LA4/r;

    .line 14
    .line 15
    const/16 v1, 0x800

    .line 16
    .line 17
    invoke-direct {v0, v1}, LA4/r;-><init>(I)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, LA3/d;->b:LA4/r;

    .line 21
    .line 22
    const-wide/16 v0, -0x1

    .line 23
    .line 24
    iput-wide v0, p0, LA3/d;->g:J

    .line 25
    .line 26
    new-instance v0, LA4/r;

    .line 27
    .line 28
    const/16 v1, 0xa

    .line 29
    .line 30
    invoke-direct {v0, v1}, LA4/r;-><init>(I)V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, LA3/d;->c:LA4/r;

    .line 34
    .line 35
    new-instance v1, LZ3/f;

    .line 36
    .line 37
    iget-object v0, v0, LA4/r;->c:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, [B

    .line 40
    .line 41
    array-length v2, v0

    .line 42
    invoke-direct {v1, v2, v0}, LZ3/f;-><init>(I[B)V

    .line 43
    .line 44
    .line 45
    iput-object v1, p0, LA3/d;->d:LZ3/f;

    .line 46
    .line 47
    return-void
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
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
.end method


# virtual methods
.method public final a()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
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
.end method

.method public final b(JJ)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, LA3/d;->h:Z

    .line 3
    .line 4
    iget-object p1, p0, LA3/d;->a:LA3/e;

    .line 5
    .line 6
    invoke-virtual {p1}, LA3/e;->a()V

    .line 7
    .line 8
    .line 9
    iput-wide p3, p0, LA3/d;->f:J

    .line 10
    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
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
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
.end method

.method public final f(Lq3/k;Lc7/j;)I
    .locals 8

    .line 1
    iget-object p2, p0, LA3/d;->e:Lq3/l;

    .line 2
    .line 3
    invoke-static {p2}, Ll4/a;->n(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    move-object p2, p1

    .line 7
    check-cast p2, Lq3/g;

    .line 8
    .line 9
    iget-wide v0, p2, Lq3/g;->c:J

    .line 10
    .line 11
    iget-object p2, p0, LA3/d;->b:LA4/r;

    .line 12
    .line 13
    iget-object v0, p2, LA4/r;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, [B

    .line 16
    .line 17
    const/16 v1, 0x800

    .line 18
    .line 19
    check-cast p1, Lq3/g;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-virtual {p1, v0, v2, v1}, Lq3/g;->D([BII)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    const/4 v0, -0x1

    .line 27
    const/4 v1, 0x1

    .line 28
    if-ne p1, v0, :cond_0

    .line 29
    .line 30
    move v3, v1

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move v3, v2

    .line 33
    :goto_0
    iget-boolean v4, p0, LA3/d;->i:Z

    .line 34
    .line 35
    if-eqz v4, :cond_1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    iget-object v4, p0, LA3/d;->e:Lq3/l;

    .line 39
    .line 40
    new-instance v5, Lq3/m;

    .line 41
    .line 42
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    invoke-direct {v5, v6, v7}, Lq3/m;-><init>(J)V

    .line 48
    .line 49
    .line 50
    invoke-interface {v4, v5}, Lq3/l;->r(Lq3/r;)V

    .line 51
    .line 52
    .line 53
    iput-boolean v1, p0, LA3/d;->i:Z

    .line 54
    .line 55
    :goto_1
    if-eqz v3, :cond_2

    .line 56
    .line 57
    return v0

    .line 58
    :cond_2
    invoke-virtual {p2, v2}, LA4/r;->H(I)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p2, p1}, LA4/r;->G(I)V

    .line 62
    .line 63
    .line 64
    iget-boolean p1, p0, LA3/d;->h:Z

    .line 65
    .line 66
    iget-object v0, p0, LA3/d;->a:LA3/e;

    .line 67
    .line 68
    if-nez p1, :cond_3

    .line 69
    .line 70
    iget-wide v3, p0, LA3/d;->f:J

    .line 71
    .line 72
    const/4 p1, 0x4

    .line 73
    invoke-virtual {v0, v3, v4, p1}, LA3/e;->e(JI)V

    .line 74
    .line 75
    .line 76
    iput-boolean v1, p0, LA3/d;->h:Z

    .line 77
    .line 78
    :cond_3
    invoke-virtual {v0, p2}, LA3/e;->c(LA4/r;)V

    .line 79
    .line 80
    .line 81
    return v2
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

.method public final i(Lq3/l;)V
    .locals 3

    .line 1
    iput-object p1, p0, LA3/d;->e:Lq3/l;

    .line 2
    .line 3
    new-instance v0, LA3/I;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    invoke-direct {v0, v1, v2}, LA3/I;-><init>(II)V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, LA3/d;->a:LA3/e;

    .line 11
    .line 12
    invoke-virtual {v1, p1, v0}, LA3/e;->f(Lq3/l;LA3/I;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p1}, Lq3/l;->i()V

    .line 16
    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
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

.method public final j(Lq3/k;)Z
    .locals 9

    .line 1
    check-cast p1, Lq3/g;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    move v1, v0

    .line 5
    :goto_0
    iget-object v2, p0, LA3/d;->c:LA4/r;

    .line 6
    .line 7
    iget-object v3, v2, LA4/r;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, [B

    .line 10
    .line 11
    const/16 v4, 0xa

    .line 12
    .line 13
    invoke-virtual {p1, v3, v0, v4, v0}, Lq3/g;->t([BIIZ)Z

    .line 14
    .line 15
    .line 16
    invoke-virtual {v2, v0}, LA4/r;->H(I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2}, LA4/r;->z()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    const v4, 0x494433

    .line 24
    .line 25
    .line 26
    if-eq v3, v4, :cond_5

    .line 27
    .line 28
    iput v0, p1, Lq3/g;->f:I

    .line 29
    .line 30
    invoke-virtual {p1, v1, v0}, Lq3/g;->c(IZ)Z

    .line 31
    .line 32
    .line 33
    iget-wide v2, p0, LA3/d;->g:J

    .line 34
    .line 35
    const-wide/16 v4, -0x1

    .line 36
    .line 37
    cmp-long v0, v2, v4

    .line 38
    .line 39
    if-nez v0, :cond_0

    .line 40
    .line 41
    int-to-long v2, v1

    .line 42
    iput-wide v2, p0, LA3/d;->g:J

    .line 43
    .line 44
    :cond_0
    const/4 v3, 0x0

    .line 45
    move v2, v1

    .line 46
    move v0, v3

    .line 47
    move v4, v0

    .line 48
    :cond_1
    iget-object v5, p0, LA3/d;->c:LA4/r;

    .line 49
    .line 50
    iget-object v6, v5, LA4/r;->c:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v6, [B

    .line 53
    .line 54
    const/4 v7, 0x2

    .line 55
    invoke-virtual {p1, v6, v3, v7, v3}, Lq3/g;->t([BIIZ)Z

    .line 56
    .line 57
    .line 58
    invoke-virtual {v5, v3}, LA4/r;->H(I)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v5}, LA4/r;->C()I

    .line 62
    .line 63
    .line 64
    move-result v6

    .line 65
    const v7, 0xfff6

    .line 66
    .line 67
    .line 68
    and-int/2addr v6, v7

    .line 69
    const v7, 0xfff0

    .line 70
    .line 71
    .line 72
    if-ne v6, v7, :cond_4

    .line 73
    .line 74
    const/4 v6, 0x1

    .line 75
    add-int/2addr v0, v6

    .line 76
    const/4 v7, 0x4

    .line 77
    if-lt v0, v7, :cond_2

    .line 78
    .line 79
    const/16 v8, 0xbc

    .line 80
    .line 81
    if-le v4, v8, :cond_2

    .line 82
    .line 83
    return v6

    .line 84
    :cond_2
    iget-object v5, v5, LA4/r;->c:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v5, [B

    .line 87
    .line 88
    invoke-virtual {p1, v5, v3, v7, v3}, Lq3/g;->t([BIIZ)Z

    .line 89
    .line 90
    .line 91
    iget-object v5, p0, LA3/d;->d:LZ3/f;

    .line 92
    .line 93
    const/16 v6, 0xe

    .line 94
    .line 95
    invoke-virtual {v5, v6}, LZ3/f;->o(I)V

    .line 96
    .line 97
    .line 98
    const/16 v6, 0xd

    .line 99
    .line 100
    invoke-virtual {v5, v6}, LZ3/f;->i(I)I

    .line 101
    .line 102
    .line 103
    move-result v5

    .line 104
    const/4 v6, 0x6

    .line 105
    if-gt v5, v6, :cond_3

    .line 106
    .line 107
    add-int/lit8 v2, v2, 0x1

    .line 108
    .line 109
    iput v3, p1, Lq3/g;->f:I

    .line 110
    .line 111
    invoke-virtual {p1, v2, v3}, Lq3/g;->c(IZ)Z

    .line 112
    .line 113
    .line 114
    :goto_1
    move v0, v3

    .line 115
    move v4, v0

    .line 116
    goto :goto_2

    .line 117
    :cond_3
    add-int/lit8 v6, v5, -0x6

    .line 118
    .line 119
    invoke-virtual {p1, v6, v3}, Lq3/g;->c(IZ)Z

    .line 120
    .line 121
    .line 122
    add-int/2addr v4, v5

    .line 123
    goto :goto_2

    .line 124
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 125
    .line 126
    iput v3, p1, Lq3/g;->f:I

    .line 127
    .line 128
    invoke-virtual {p1, v2, v3}, Lq3/g;->c(IZ)Z

    .line 129
    .line 130
    .line 131
    goto :goto_1

    .line 132
    :goto_2
    sub-int v5, v2, v1

    .line 133
    .line 134
    const/16 v6, 0x2000

    .line 135
    .line 136
    if-lt v5, v6, :cond_1

    .line 137
    .line 138
    return v3

    .line 139
    :cond_5
    const/4 v3, 0x3

    .line 140
    invoke-virtual {v2, v3}, LA4/r;->I(I)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v2}, LA4/r;->w()I

    .line 144
    .line 145
    .line 146
    move-result v2

    .line 147
    add-int/lit8 v3, v2, 0xa

    .line 148
    .line 149
    add-int/2addr v1, v3

    .line 150
    invoke-virtual {p1, v2, v0}, Lq3/g;->c(IZ)Z

    .line 151
    .line 152
    .line 153
    goto/16 :goto_0
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
