.class public final LA3/y;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final b:Ll4/x;

.field public final c:LA4/r;

.field public d:Z

.field public e:Z

.field public f:Z

.field public g:J

.field public h:J

.field public i:J


# direct methods
.method public constructor <init>(I)V
    .locals 2

    .line 1
    iput p1, p0, LA3/y;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance p1, Ll4/x;

    .line 10
    .line 11
    const-wide/16 v0, 0x0

    .line 12
    .line 13
    invoke-direct {p1, v0, v1}, Ll4/x;-><init>(J)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, LA3/y;->b:Ll4/x;

    .line 17
    .line 18
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    iput-wide v0, p0, LA3/y;->g:J

    .line 24
    .line 25
    iput-wide v0, p0, LA3/y;->h:J

    .line 26
    .line 27
    iput-wide v0, p0, LA3/y;->i:J

    .line 28
    .line 29
    new-instance p1, LA4/r;

    .line 30
    .line 31
    const/4 v0, 0x5

    .line 32
    const/4 v1, 0x0

    .line 33
    invoke-direct {p1, v0, v1}, LA4/r;-><init>(IZ)V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, LA3/y;->c:LA4/r;

    .line 37
    .line 38
    return-void

    .line 39
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    .line 41
    .line 42
    new-instance p1, Ll4/x;

    .line 43
    .line 44
    const-wide/16 v0, 0x0

    .line 45
    .line 46
    invoke-direct {p1, v0, v1}, Ll4/x;-><init>(J)V

    .line 47
    .line 48
    .line 49
    iput-object p1, p0, LA3/y;->b:Ll4/x;

    .line 50
    .line 51
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    iput-wide v0, p0, LA3/y;->g:J

    .line 57
    .line 58
    iput-wide v0, p0, LA3/y;->h:J

    .line 59
    .line 60
    iput-wide v0, p0, LA3/y;->i:J

    .line 61
    .line 62
    new-instance p1, LA4/r;

    .line 63
    .line 64
    const/4 v0, 0x5

    .line 65
    const/4 v1, 0x0

    .line 66
    invoke-direct {p1, v0, v1}, LA4/r;-><init>(IZ)V

    .line 67
    .line 68
    .line 69
    iput-object p1, p0, LA3/y;->c:LA4/r;

    .line 70
    .line 71
    return-void

    .line 72
    nop

    .line 73
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
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
.end method

.method public static b(I[B)I
    .locals 2

    .line 1
    aget-byte v0, p1, p0

    .line 2
    .line 3
    and-int/lit16 v0, v0, 0xff

    .line 4
    .line 5
    shl-int/lit8 v0, v0, 0x18

    .line 6
    .line 7
    add-int/lit8 v1, p0, 0x1

    .line 8
    .line 9
    aget-byte v1, p1, v1

    .line 10
    .line 11
    and-int/lit16 v1, v1, 0xff

    .line 12
    .line 13
    shl-int/lit8 v1, v1, 0x10

    .line 14
    .line 15
    or-int/2addr v0, v1

    .line 16
    add-int/lit8 v1, p0, 0x2

    .line 17
    .line 18
    aget-byte v1, p1, v1

    .line 19
    .line 20
    and-int/lit16 v1, v1, 0xff

    .line 21
    .line 22
    shl-int/lit8 v1, v1, 0x8

    .line 23
    .line 24
    or-int/2addr v0, v1

    .line 25
    add-int/lit8 p0, p0, 0x3

    .line 26
    .line 27
    aget-byte p0, p1, p0

    .line 28
    .line 29
    and-int/lit16 p0, p0, 0xff

    .line 30
    .line 31
    or-int/2addr p0, v0

    .line 32
    return p0
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

.method public static c(LA4/r;)J
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, LA4/r;->a:I

    .line 4
    .line 5
    invoke-virtual {v0}, LA4/r;->e()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    const/16 v5, 0x9

    .line 15
    .line 16
    if-ge v2, v5, :cond_0

    .line 17
    .line 18
    return-wide v3

    .line 19
    :cond_0
    new-array v2, v5, [B

    .line 20
    .line 21
    const/4 v6, 0x0

    .line 22
    invoke-virtual {v0, v2, v6, v5}, LA4/r;->h([BII)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, LA4/r;->H(I)V

    .line 26
    .line 27
    .line 28
    aget-byte v0, v2, v6

    .line 29
    .line 30
    and-int/lit16 v1, v0, 0xc4

    .line 31
    .line 32
    const/16 v5, 0x44

    .line 33
    .line 34
    if-eq v1, v5, :cond_1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const/4 v1, 0x2

    .line 38
    aget-byte v1, v2, v1

    .line 39
    .line 40
    and-int/lit8 v5, v1, 0x4

    .line 41
    .line 42
    const/4 v6, 0x4

    .line 43
    if-eq v5, v6, :cond_2

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    aget-byte v5, v2, v6

    .line 47
    .line 48
    and-int/lit8 v7, v5, 0x4

    .line 49
    .line 50
    if-eq v7, v6, :cond_3

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_3
    const/4 v6, 0x5

    .line 54
    aget-byte v7, v2, v6

    .line 55
    .line 56
    const/4 v8, 0x1

    .line 57
    and-int/2addr v7, v8

    .line 58
    if-eq v7, v8, :cond_4

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_4
    const/16 v7, 0x8

    .line 62
    .line 63
    aget-byte v7, v2, v7

    .line 64
    .line 65
    const/4 v9, 0x3

    .line 66
    and-int/2addr v7, v9

    .line 67
    if-ne v7, v9, :cond_5

    .line 68
    .line 69
    int-to-long v3, v0

    .line 70
    const-wide/16 v10, 0x38

    .line 71
    .line 72
    and-long/2addr v10, v3

    .line 73
    shr-long/2addr v10, v9

    .line 74
    const/16 v0, 0x1e

    .line 75
    .line 76
    shl-long/2addr v10, v0

    .line 77
    const-wide/16 v12, 0x3

    .line 78
    .line 79
    and-long/2addr v3, v12

    .line 80
    const/16 v0, 0x1c

    .line 81
    .line 82
    shl-long/2addr v3, v0

    .line 83
    or-long/2addr v3, v10

    .line 84
    aget-byte v0, v2, v8

    .line 85
    .line 86
    int-to-long v7, v0

    .line 87
    const-wide/16 v10, 0xff

    .line 88
    .line 89
    and-long/2addr v7, v10

    .line 90
    const/16 v0, 0x14

    .line 91
    .line 92
    shl-long/2addr v7, v0

    .line 93
    or-long/2addr v3, v7

    .line 94
    int-to-long v0, v1

    .line 95
    const-wide/16 v7, 0xf8

    .line 96
    .line 97
    and-long v14, v0, v7

    .line 98
    .line 99
    shr-long/2addr v14, v9

    .line 100
    const/16 v16, 0xf

    .line 101
    .line 102
    shl-long v14, v14, v16

    .line 103
    .line 104
    or-long/2addr v3, v14

    .line 105
    and-long/2addr v0, v12

    .line 106
    const/16 v12, 0xd

    .line 107
    .line 108
    shl-long/2addr v0, v12

    .line 109
    or-long/2addr v0, v3

    .line 110
    aget-byte v2, v2, v9

    .line 111
    .line 112
    int-to-long v2, v2

    .line 113
    and-long/2addr v2, v10

    .line 114
    shl-long/2addr v2, v6

    .line 115
    or-long/2addr v0, v2

    .line 116
    int-to-long v2, v5

    .line 117
    and-long/2addr v2, v7

    .line 118
    shr-long/2addr v2, v9

    .line 119
    or-long/2addr v0, v2

    .line 120
    return-wide v0

    .line 121
    :cond_5
    :goto_0
    return-wide v3
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


# virtual methods
.method public final a(Lq3/g;)V
    .locals 3

    .line 1
    iget v0, p0, LA3/y;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object v0, Ll4/y;->f:[B

    .line 7
    .line 8
    iget-object v1, p0, LA3/y;->c:LA4/r;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    array-length v2, v0

    .line 14
    invoke-virtual {v1, v2, v0}, LA4/r;->F(I[B)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    iput-boolean v0, p0, LA3/y;->d:Z

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    iput v0, p1, Lq3/g;->f:I

    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_0
    sget-object v0, Ll4/y;->f:[B

    .line 25
    .line 26
    iget-object v1, p0, LA3/y;->c:LA4/r;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    array-length v2, v0

    .line 32
    invoke-virtual {v1, v2, v0}, LA4/r;->F(I[B)V

    .line 33
    .line 34
    .line 35
    const/4 v0, 0x1

    .line 36
    iput-boolean v0, p0, LA3/y;->d:Z

    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    iput v0, p1, Lq3/g;->f:I

    .line 40
    .line 41
    return-void

    .line 42
    nop

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 44
    .line 45
    .line 46
    .line 47
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
.end method
