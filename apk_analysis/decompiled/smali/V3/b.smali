.class public final LV3/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV3/h;


# instance fields
.field public final a:LU3/l;

.field public final b:LZ3/f;

.field public c:Lq3/u;

.field public d:I

.field public e:J

.field public f:J

.field public g:J


# direct methods
.method public constructor <init>(LU3/l;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LV3/b;->a:LU3/l;

    .line 5
    .line 6
    new-instance p1, LZ3/f;

    .line 7
    .line 8
    invoke-direct {p1}, LZ3/f;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, LV3/b;->b:LZ3/f;

    .line 12
    .line 13
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    iput-wide v0, p0, LV3/b;->e:J

    .line 19
    .line 20
    return-void
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


# virtual methods
.method public final b(JJ)V
    .locals 0

    .line 1
    iput-wide p1, p0, LV3/b;->e:J

    .line 2
    .line 3
    iput-wide p3, p0, LV3/b;->g:J

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
    .locals 4

    .line 1
    iget-wide v0, p0, LV3/b;->e:J

    .line 2
    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long v0, v0, v2

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    invoke-static {v0}, Ll4/a;->m(Z)V

    .line 16
    .line 17
    .line 18
    iput-wide p1, p0, LV3/b;->e:J

    .line 19
    .line 20
    return-void
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
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-virtual {v1}, LA4/r;->x()I

    .line 7
    .line 8
    .line 9
    move-result v3

    .line 10
    const/4 v4, 0x3

    .line 11
    and-int/2addr v3, v4

    .line 12
    invoke-virtual {v1}, LA4/r;->x()I

    .line 13
    .line 14
    .line 15
    move-result v5

    .line 16
    and-int/lit16 v5, v5, 0xff

    .line 17
    .line 18
    iget-wide v6, v0, LV3/b;->g:J

    .line 19
    .line 20
    iget-wide v10, v0, LV3/b;->e:J

    .line 21
    .line 22
    iget-object v8, v0, LV3/b;->a:LU3/l;

    .line 23
    .line 24
    iget v12, v8, LU3/l;->b:I

    .line 25
    .line 26
    move-wide/from16 v8, p2

    .line 27
    .line 28
    invoke-static/range {v6 .. v12}, Ll6/b;->w(JJJI)J

    .line 29
    .line 30
    .line 31
    move-result-wide v14

    .line 32
    const/4 v6, 0x0

    .line 33
    const/4 v7, 0x2

    .line 34
    if-eqz v3, :cond_3

    .line 35
    .line 36
    if-eq v3, v2, :cond_1

    .line 37
    .line 38
    if-eq v3, v7, :cond_1

    .line 39
    .line 40
    if-ne v3, v4, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 44
    .line 45
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw v1

    .line 53
    :cond_1
    iget v11, v0, LV3/b;->d:I

    .line 54
    .line 55
    if-lez v11, :cond_2

    .line 56
    .line 57
    iget-object v7, v0, LV3/b;->c:Lq3/u;

    .line 58
    .line 59
    sget v2, Ll4/y;->a:I

    .line 60
    .line 61
    iget-wide v8, v0, LV3/b;->f:J

    .line 62
    .line 63
    const/4 v10, 0x1

    .line 64
    const/4 v12, 0x0

    .line 65
    const/4 v13, 0x0

    .line 66
    invoke-interface/range {v7 .. v13}, Lq3/u;->d(JIIILq3/t;)V

    .line 67
    .line 68
    .line 69
    iput v6, v0, LV3/b;->d:I

    .line 70
    .line 71
    :cond_2
    :goto_0
    invoke-virtual {v1}, LA4/r;->e()I

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    iget-object v5, v0, LV3/b;->c:Lq3/u;

    .line 76
    .line 77
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    invoke-interface {v5, v2, v1}, Lq3/u;->c(ILA4/r;)V

    .line 81
    .line 82
    .line 83
    iget v1, v0, LV3/b;->d:I

    .line 84
    .line 85
    add-int/2addr v1, v2

    .line 86
    iput v1, v0, LV3/b;->d:I

    .line 87
    .line 88
    iput-wide v14, v0, LV3/b;->f:J

    .line 89
    .line 90
    if-eqz p5, :cond_6

    .line 91
    .line 92
    if-ne v3, v4, :cond_6

    .line 93
    .line 94
    iget-object v13, v0, LV3/b;->c:Lq3/u;

    .line 95
    .line 96
    sget v2, Ll4/y;->a:I

    .line 97
    .line 98
    const/16 v19, 0x0

    .line 99
    .line 100
    const/16 v16, 0x1

    .line 101
    .line 102
    const/16 v18, 0x0

    .line 103
    .line 104
    move/from16 v17, v1

    .line 105
    .line 106
    invoke-interface/range {v13 .. v19}, Lq3/u;->d(JIIILq3/t;)V

    .line 107
    .line 108
    .line 109
    iput v6, v0, LV3/b;->d:I

    .line 110
    .line 111
    return-void

    .line 112
    :cond_3
    iget v3, v0, LV3/b;->d:I

    .line 113
    .line 114
    if-lez v3, :cond_4

    .line 115
    .line 116
    iget-object v4, v0, LV3/b;->c:Lq3/u;

    .line 117
    .line 118
    sget v8, Ll4/y;->a:I

    .line 119
    .line 120
    iget-wide v8, v0, LV3/b;->f:J

    .line 121
    .line 122
    const/16 v19, 0x1

    .line 123
    .line 124
    const/16 v21, 0x0

    .line 125
    .line 126
    const/16 v22, 0x0

    .line 127
    .line 128
    move/from16 v20, v3

    .line 129
    .line 130
    move-object/from16 v16, v4

    .line 131
    .line 132
    move-wide/from16 v17, v8

    .line 133
    .line 134
    invoke-interface/range {v16 .. v22}, Lq3/u;->d(JIIILq3/t;)V

    .line 135
    .line 136
    .line 137
    iput v6, v0, LV3/b;->d:I

    .line 138
    .line 139
    :cond_4
    if-ne v5, v2, :cond_5

    .line 140
    .line 141
    invoke-virtual {v1}, LA4/r;->e()I

    .line 142
    .line 143
    .line 144
    move-result v2

    .line 145
    iget-object v3, v0, LV3/b;->c:Lq3/u;

    .line 146
    .line 147
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    invoke-interface {v3, v2, v1}, Lq3/u;->c(ILA4/r;)V

    .line 151
    .line 152
    .line 153
    iget-object v13, v0, LV3/b;->c:Lq3/u;

    .line 154
    .line 155
    sget v1, Ll4/y;->a:I

    .line 156
    .line 157
    const/16 v16, 0x1

    .line 158
    .line 159
    const/16 v18, 0x0

    .line 160
    .line 161
    const/16 v19, 0x0

    .line 162
    .line 163
    move/from16 v17, v2

    .line 164
    .line 165
    invoke-interface/range {v13 .. v19}, Lq3/u;->d(JIIILq3/t;)V

    .line 166
    .line 167
    .line 168
    return-void

    .line 169
    :cond_5
    iget-object v3, v1, LA4/r;->c:Ljava/lang/Object;

    .line 170
    .line 171
    check-cast v3, [B

    .line 172
    .line 173
    iget-object v4, v0, LV3/b;->b:LZ3/f;

    .line 174
    .line 175
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    array-length v8, v3

    .line 179
    invoke-virtual {v4, v8, v3}, LZ3/f;->n(I[B)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v4, v7}, LZ3/f;->s(I)V

    .line 183
    .line 184
    .line 185
    move-wide v8, v14

    .line 186
    :goto_1
    if-ge v6, v5, :cond_6

    .line 187
    .line 188
    invoke-static {v4}, Ll3/a;->g(LZ3/f;)Ll3/b;

    .line 189
    .line 190
    .line 191
    move-result-object v3

    .line 192
    iget-object v7, v0, LV3/b;->c:Lq3/u;

    .line 193
    .line 194
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    iget v14, v3, Ll3/b;->c:I

    .line 198
    .line 199
    invoke-interface {v7, v14, v1}, Lq3/u;->c(ILA4/r;)V

    .line 200
    .line 201
    .line 202
    iget-object v7, v0, LV3/b;->c:Lq3/u;

    .line 203
    .line 204
    sget v10, Ll4/y;->a:I

    .line 205
    .line 206
    const/4 v12, 0x0

    .line 207
    const/4 v13, 0x0

    .line 208
    const/4 v10, 0x1

    .line 209
    iget v11, v3, Ll3/b;->c:I

    .line 210
    .line 211
    invoke-interface/range {v7 .. v13}, Lq3/u;->d(JIIILq3/t;)V

    .line 212
    .line 213
    .line 214
    iget v7, v3, Ll3/b;->d:I

    .line 215
    .line 216
    iget v3, v3, Ll3/b;->a:I

    .line 217
    .line 218
    div-int/2addr v7, v3

    .line 219
    int-to-long v10, v7

    .line 220
    const-wide/32 v12, 0xf4240

    .line 221
    .line 222
    .line 223
    mul-long/2addr v10, v12

    .line 224
    add-long/2addr v8, v10

    .line 225
    invoke-virtual {v4, v14}, LZ3/f;->s(I)V

    .line 226
    .line 227
    .line 228
    add-int/2addr v6, v2

    .line 229
    goto :goto_1

    .line 230
    :cond_6
    return-void
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
    iput-object p1, p0, LV3/b;->c:Lq3/u;

    .line 7
    .line 8
    iget-object p2, p0, LV3/b;->a:LU3/l;

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
