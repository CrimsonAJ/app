.class public final LN3/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV3/h;


# instance fields
.field public a:I

.field public b:J

.field public c:I

.field public d:J

.field public e:I

.field public final f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(IILj3/M;ILjava/lang/Object;JJ)V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput p1, p0, LN3/v;->a:I

    .line 7
    iput p2, p0, LN3/v;->c:I

    .line 8
    iput-object p3, p0, LN3/v;->f:Ljava/lang/Object;

    .line 9
    iput p4, p0, LN3/v;->e:I

    .line 10
    iput-object p5, p0, LN3/v;->g:Ljava/lang/Object;

    .line 11
    iput-wide p6, p0, LN3/v;->b:J

    .line 12
    iput-wide p8, p0, LN3/v;->d:J

    return-void
.end method

.method public constructor <init>(LU3/l;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LN3/v;->f:Ljava/lang/Object;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 3
    iput-wide v0, p0, LN3/v;->b:J

    const/4 p1, -0x1

    .line 4
    iput p1, p0, LN3/v;->c:I

    return-void
.end method


# virtual methods
.method public b(JJ)V
    .locals 0

    .line 1
    iput-wide p1, p0, LN3/v;->b:J

    .line 2
    .line 3
    iput-wide p3, p0, LN3/v;->d:J

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    iput p1, p0, LN3/v;->e:I

    .line 7
    .line 8
    return-void
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

.method public c(J)V
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
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public d(LA4/r;JIZ)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p4

    .line 6
    .line 7
    const/4 v3, 0x4

    .line 8
    const/4 v4, 0x1

    .line 9
    iget-object v5, v0, LN3/v;->g:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v5, Lq3/u;

    .line 12
    .line 13
    invoke-static {v5}, Ll4/a;->n(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iget v5, v0, LN3/v;->c:I

    .line 17
    .line 18
    const/4 v6, -0x1

    .line 19
    if-eq v5, v6, :cond_0

    .line 20
    .line 21
    invoke-static {v5}, LU3/i;->a(I)I

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    if-eq v2, v5, :cond_0

    .line 26
    .line 27
    sget v7, Ll4/y;->a:I

    .line 28
    .line 29
    sget-object v7, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 30
    .line 31
    new-instance v7, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    const-string v8, "Received RTP packet with unexpected sequence number. Expected: "

    .line 34
    .line 35
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v5, "; received: "

    .line 42
    .line 43
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string v5, ". Dropping packet."

    .line 50
    .line 51
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    const-string v7, "RtpMpeg4Reader"

    .line 59
    .line 60
    invoke-static {v7, v5}, Ll4/a;->P(Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    :cond_0
    invoke-virtual {v1}, LA4/r;->e()I

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    iget-object v7, v0, LN3/v;->g:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v7, Lq3/u;

    .line 70
    .line 71
    invoke-interface {v7, v5, v1}, Lq3/u;->c(ILA4/r;)V

    .line 72
    .line 73
    .line 74
    iget v7, v0, LN3/v;->e:I

    .line 75
    .line 76
    const/4 v8, 0x0

    .line 77
    if-nez v7, :cond_5

    .line 78
    .line 79
    iget-object v7, v1, LA4/r;->c:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v7, [B

    .line 82
    .line 83
    new-array v9, v3, [B

    .line 84
    .line 85
    fill-array-data v9, :array_0

    .line 86
    .line 87
    .line 88
    const-string v10, "array"

    .line 89
    .line 90
    invoke-static {v7, v10}, LO4/h;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    move v10, v8

    .line 94
    :goto_0
    array-length v11, v7

    .line 95
    add-int/lit8 v11, v11, -0x3

    .line 96
    .line 97
    if-ge v10, v11, :cond_2

    .line 98
    .line 99
    move v11, v8

    .line 100
    :goto_1
    if-ge v11, v3, :cond_3

    .line 101
    .line 102
    add-int v12, v10, v11

    .line 103
    .line 104
    aget-byte v12, v7, v12

    .line 105
    .line 106
    aget-byte v13, v9, v11

    .line 107
    .line 108
    if-eq v12, v13, :cond_1

    .line 109
    .line 110
    add-int/2addr v10, v4

    .line 111
    goto :goto_0

    .line 112
    :cond_1
    add-int/2addr v11, v4

    .line 113
    goto :goto_1

    .line 114
    :cond_2
    move v10, v6

    .line 115
    :cond_3
    if-eq v10, v6, :cond_4

    .line 116
    .line 117
    add-int/2addr v10, v3

    .line 118
    invoke-virtual {v1, v10}, LA4/r;->H(I)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v1}, LA4/r;->g()I

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    shr-int/lit8 v1, v1, 0x6

    .line 126
    .line 127
    if-nez v1, :cond_4

    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_4
    move v4, v8

    .line 131
    :goto_2
    iput v4, v0, LN3/v;->a:I

    .line 132
    .line 133
    :cond_5
    iget v1, v0, LN3/v;->e:I

    .line 134
    .line 135
    add-int/2addr v1, v5

    .line 136
    iput v1, v0, LN3/v;->e:I

    .line 137
    .line 138
    if-eqz p5, :cond_7

    .line 139
    .line 140
    iget-wide v3, v0, LN3/v;->b:J

    .line 141
    .line 142
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    cmp-long v1, v3, v5

    .line 148
    .line 149
    move-wide/from16 v11, p2

    .line 150
    .line 151
    if-nez v1, :cond_6

    .line 152
    .line 153
    iput-wide v11, v0, LN3/v;->b:J

    .line 154
    .line 155
    :cond_6
    iget-wide v9, v0, LN3/v;->d:J

    .line 156
    .line 157
    iget-wide v13, v0, LN3/v;->b:J

    .line 158
    .line 159
    const v15, 0x15f90

    .line 160
    .line 161
    .line 162
    invoke-static/range {v9 .. v15}, Ll6/b;->w(JJJI)J

    .line 163
    .line 164
    .line 165
    move-result-wide v17

    .line 166
    iget-object v1, v0, LN3/v;->g:Ljava/lang/Object;

    .line 167
    .line 168
    move-object/from16 v16, v1

    .line 169
    .line 170
    check-cast v16, Lq3/u;

    .line 171
    .line 172
    iget v1, v0, LN3/v;->a:I

    .line 173
    .line 174
    iget v3, v0, LN3/v;->e:I

    .line 175
    .line 176
    const/16 v21, 0x0

    .line 177
    .line 178
    const/16 v22, 0x0

    .line 179
    .line 180
    move/from16 v19, v1

    .line 181
    .line 182
    move/from16 v20, v3

    .line 183
    .line 184
    invoke-interface/range {v16 .. v22}, Lq3/u;->d(JIIILq3/t;)V

    .line 185
    .line 186
    .line 187
    iput v8, v0, LN3/v;->e:I

    .line 188
    .line 189
    :cond_7
    iput v2, v0, LN3/v;->c:I

    .line 190
    .line 191
    return-void

    .line 192
    nop

    .line 193
    :array_0
    .array-data 1
        0x0t
        0x0t
        0x1t
        -0x4at
    .end array-data
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

.method public e(Lq3/l;I)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-interface {p1, p2, v0}, Lq3/l;->u(II)Lq3/u;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    iput-object p1, p0, LN3/v;->g:Ljava/lang/Object;

    .line 7
    .line 8
    sget p2, Ll4/y;->a:I

    .line 9
    .line 10
    iget-object p2, p0, LN3/v;->f:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p2, LU3/l;

    .line 13
    .line 14
    iget-object p2, p2, LU3/l;->c:Lj3/M;

    .line 15
    .line 16
    invoke-interface {p1, p2}, Lq3/u;->e(Lj3/M;)V

    .line 17
    .line 18
    .line 19
    return-void
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
