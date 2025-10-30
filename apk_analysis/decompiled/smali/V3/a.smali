.class public final LV3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV3/h;


# instance fields
.field public final a:LU3/l;

.field public final b:LZ3/f;

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public g:J

.field public h:Lq3/u;

.field public i:J


# direct methods
.method public constructor <init>(LU3/l;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LV3/a;->a:LU3/l;

    .line 5
    .line 6
    new-instance v0, LZ3/f;

    .line 7
    .line 8
    invoke-direct {v0}, LZ3/f;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, LV3/a;->b:LZ3/f;

    .line 12
    .line 13
    iget v0, p1, LU3/l;->b:I

    .line 14
    .line 15
    iput v0, p0, LV3/a;->c:I

    .line 16
    .line 17
    iget-object p1, p1, LU3/l;->d:LP5/X;

    .line 18
    .line 19
    const-string v0, "mode"

    .line 20
    .line 21
    invoke-virtual {p1, v0}, LP5/X;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    const-string v0, "AAC-hbr"

    .line 31
    .line 32
    invoke-static {p1, v0}, LB6/u0;->w(Ljava/lang/String;Ljava/lang/String;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    const/16 p1, 0xd

    .line 39
    .line 40
    iput p1, p0, LV3/a;->d:I

    .line 41
    .line 42
    const/4 p1, 0x3

    .line 43
    iput p1, p0, LV3/a;->e:I

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    const-string v0, "AAC-lbr"

    .line 47
    .line 48
    invoke-static {p1, v0}, LB6/u0;->w(Ljava/lang/String;Ljava/lang/String;)Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-eqz p1, :cond_1

    .line 53
    .line 54
    const/4 p1, 0x6

    .line 55
    iput p1, p0, LV3/a;->d:I

    .line 56
    .line 57
    const/4 p1, 0x2

    .line 58
    iput p1, p0, LV3/a;->e:I

    .line 59
    .line 60
    :goto_0
    iget p1, p0, LV3/a;->e:I

    .line 61
    .line 62
    iget v0, p0, LV3/a;->d:I

    .line 63
    .line 64
    add-int/2addr p1, v0

    .line 65
    iput p1, p0, LV3/a;->f:I

    .line 66
    .line 67
    return-void

    .line 68
    :cond_1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 69
    .line 70
    const-string v0, "AAC mode not supported"

    .line 71
    .line 72
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw p1
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
.end method


# virtual methods
.method public final b(JJ)V
    .locals 0

    .line 1
    iput-wide p1, p0, LV3/a;->g:J

    .line 2
    .line 3
    iput-wide p3, p0, LV3/a;->i:J

    .line 4
    .line 5
    return-void
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

.method public final c(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, LV3/a;->g:J

    .line 2
    .line 3
    return-void
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
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public final d(LA4/r;JIZ)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, LV3/a;->h:Lq3/u;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, LA4/r;->u()S

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    iget v3, v0, LV3/a;->f:I

    .line 15
    .line 16
    div-int v3, v2, v3

    .line 17
    .line 18
    iget-wide v4, v0, LV3/a;->i:J

    .line 19
    .line 20
    iget-wide v8, v0, LV3/a;->g:J

    .line 21
    .line 22
    iget v10, v0, LV3/a;->c:I

    .line 23
    .line 24
    move-wide/from16 v6, p2

    .line 25
    .line 26
    invoke-static/range {v4 .. v10}, Ll6/b;->w(JJJI)J

    .line 27
    .line 28
    .line 29
    move-result-wide v12

    .line 30
    iget-object v4, v0, LV3/a;->b:LZ3/f;

    .line 31
    .line 32
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    iget-object v5, v1, LA4/r;->c:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v5, [B

    .line 38
    .line 39
    iget v6, v1, LA4/r;->b:I

    .line 40
    .line 41
    invoke-virtual {v4, v6, v5}, LZ3/f;->n(I[B)V

    .line 42
    .line 43
    .line 44
    iget v5, v1, LA4/r;->a:I

    .line 45
    .line 46
    mul-int/lit8 v5, v5, 0x8

    .line 47
    .line 48
    invoke-virtual {v4, v5}, LZ3/f;->o(I)V

    .line 49
    .line 50
    .line 51
    const/4 v5, 0x1

    .line 52
    iget v6, v0, LV3/a;->e:I

    .line 53
    .line 54
    iget v7, v0, LV3/a;->d:I

    .line 55
    .line 56
    if-ne v3, v5, :cond_0

    .line 57
    .line 58
    invoke-virtual {v4, v7}, LZ3/f;->i(I)I

    .line 59
    .line 60
    .line 61
    move-result v15

    .line 62
    invoke-virtual {v4, v6}, LZ3/f;->r(I)V

    .line 63
    .line 64
    .line 65
    iget-object v2, v0, LV3/a;->h:Lq3/u;

    .line 66
    .line 67
    invoke-virtual {v1}, LA4/r;->e()I

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    invoke-interface {v2, v3, v1}, Lq3/u;->c(ILA4/r;)V

    .line 72
    .line 73
    .line 74
    if-eqz p5, :cond_1

    .line 75
    .line 76
    iget-object v11, v0, LV3/a;->h:Lq3/u;

    .line 77
    .line 78
    const/16 v17, 0x0

    .line 79
    .line 80
    const/4 v14, 0x1

    .line 81
    const/16 v16, 0x0

    .line 82
    .line 83
    invoke-interface/range {v11 .. v17}, Lq3/u;->d(JIIILq3/t;)V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :cond_0
    add-int/lit8 v2, v2, 0x7

    .line 88
    .line 89
    div-int/lit8 v2, v2, 0x8

    .line 90
    .line 91
    invoke-virtual {v1, v2}, LA4/r;->I(I)V

    .line 92
    .line 93
    .line 94
    const/4 v2, 0x0

    .line 95
    move-wide v9, v12

    .line 96
    :goto_0
    if-ge v2, v3, :cond_1

    .line 97
    .line 98
    invoke-virtual {v4, v7}, LZ3/f;->i(I)I

    .line 99
    .line 100
    .line 101
    move-result v12

    .line 102
    invoke-virtual {v4, v6}, LZ3/f;->r(I)V

    .line 103
    .line 104
    .line 105
    iget-object v5, v0, LV3/a;->h:Lq3/u;

    .line 106
    .line 107
    invoke-interface {v5, v12, v1}, Lq3/u;->c(ILA4/r;)V

    .line 108
    .line 109
    .line 110
    iget-object v8, v0, LV3/a;->h:Lq3/u;

    .line 111
    .line 112
    const/4 v14, 0x0

    .line 113
    const/4 v11, 0x1

    .line 114
    const/4 v13, 0x0

    .line 115
    invoke-interface/range {v8 .. v14}, Lq3/u;->d(JIIILq3/t;)V

    .line 116
    .line 117
    .line 118
    int-to-long v11, v3

    .line 119
    iget v5, v0, LV3/a;->c:I

    .line 120
    .line 121
    int-to-long v13, v5

    .line 122
    move-wide v15, v13

    .line 123
    const-wide/32 v13, 0xf4240

    .line 124
    .line 125
    .line 126
    invoke-static/range {v11 .. v16}, Ll4/y;->O(JJJ)J

    .line 127
    .line 128
    .line 129
    move-result-wide v11

    .line 130
    add-long/2addr v9, v11

    .line 131
    add-int/lit8 v2, v2, 0x1

    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_1
    return-void
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
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
.end method

.method public final e(Lq3/l;I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-interface {p1, p2, v0}, Lq3/l;->u(II)Lq3/u;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    iput-object p1, p0, LV3/a;->h:Lq3/u;

    .line 7
    .line 8
    iget-object p2, p0, LV3/a;->a:LU3/l;

    .line 9
    .line 10
    iget-object p2, p2, LU3/l;->c:Lj3/M;

    .line 11
    .line 12
    invoke-interface {p1, p2}, Lq3/u;->e(Lj3/M;)V

    .line 13
    .line 14
    .line 15
    return-void
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
