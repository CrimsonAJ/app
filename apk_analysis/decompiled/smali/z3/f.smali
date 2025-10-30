.class public final Lz3/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:J

.field public c:I

.field public d:I

.field public e:I

.field public final f:[I

.field public final g:LA4/r;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0xff

    .line 5
    .line 6
    new-array v1, v0, [I

    .line 7
    .line 8
    iput-object v1, p0, Lz3/f;->f:[I

    .line 9
    .line 10
    new-instance v1, LA4/r;

    .line 11
    .line 12
    invoke-direct {v1, v0}, LA4/r;-><init>(I)V

    .line 13
    .line 14
    .line 15
    iput-object v1, p0, Lz3/f;->g:LA4/r;

    .line 16
    .line 17
    return-void
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


# virtual methods
.method public final a(Lq3/g;Z)Z
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lz3/f;->a:I

    .line 3
    .line 4
    const-wide/16 v1, 0x0

    .line 5
    .line 6
    iput-wide v1, p0, Lz3/f;->b:J

    .line 7
    .line 8
    iput v0, p0, Lz3/f;->c:I

    .line 9
    .line 10
    iput v0, p0, Lz3/f;->d:I

    .line 11
    .line 12
    iput v0, p0, Lz3/f;->e:I

    .line 13
    .line 14
    iget-object v1, p0, Lz3/f;->g:LA4/r;

    .line 15
    .line 16
    const/16 v2, 0x1b

    .line 17
    .line 18
    invoke-virtual {v1, v2}, LA4/r;->E(I)V

    .line 19
    .line 20
    .line 21
    iget-object v3, v1, LA4/r;->c:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v3, [B

    .line 24
    .line 25
    :try_start_0
    invoke-virtual {p1, v3, v0, v2, p2}, Lq3/g;->t([BIIZ)Z

    .line 26
    .line 27
    .line 28
    move-result v2
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    goto :goto_0

    .line 30
    :catch_0
    move-exception v2

    .line 31
    if-eqz p2, :cond_7

    .line 32
    .line 33
    move v2, v0

    .line 34
    :goto_0
    if-eqz v2, :cond_6

    .line 35
    .line 36
    invoke-virtual {v1}, LA4/r;->y()J

    .line 37
    .line 38
    .line 39
    move-result-wide v2

    .line 40
    const-wide/32 v4, 0x4f676753

    .line 41
    .line 42
    .line 43
    cmp-long v2, v2, v4

    .line 44
    .line 45
    if-eqz v2, :cond_0

    .line 46
    .line 47
    goto :goto_3

    .line 48
    :cond_0
    invoke-virtual {v1}, LA4/r;->x()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-eqz v2, :cond_2

    .line 53
    .line 54
    if-eqz p2, :cond_1

    .line 55
    .line 56
    goto :goto_3

    .line 57
    :cond_1
    const-string p1, "unsupported bit stream revision"

    .line 58
    .line 59
    invoke-static {p1}, Lj3/j0;->c(Ljava/lang/String;)Lj3/j0;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    throw p1

    .line 64
    :cond_2
    invoke-virtual {v1}, LA4/r;->x()I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    iput v2, p0, Lz3/f;->a:I

    .line 69
    .line 70
    invoke-virtual {v1}, LA4/r;->l()J

    .line 71
    .line 72
    .line 73
    move-result-wide v2

    .line 74
    iput-wide v2, p0, Lz3/f;->b:J

    .line 75
    .line 76
    invoke-virtual {v1}, LA4/r;->n()J

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1}, LA4/r;->n()J

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1}, LA4/r;->n()J

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1}, LA4/r;->x()I

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    iput v2, p0, Lz3/f;->c:I

    .line 90
    .line 91
    add-int/lit8 v3, v2, 0x1b

    .line 92
    .line 93
    iput v3, p0, Lz3/f;->d:I

    .line 94
    .line 95
    invoke-virtual {v1, v2}, LA4/r;->E(I)V

    .line 96
    .line 97
    .line 98
    iget-object v2, v1, LA4/r;->c:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v2, [B

    .line 101
    .line 102
    iget v3, p0, Lz3/f;->c:I

    .line 103
    .line 104
    :try_start_1
    invoke-virtual {p1, v2, v0, v3, p2}, Lq3/g;->t([BIIZ)Z

    .line 105
    .line 106
    .line 107
    move-result p1
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_1

    .line 108
    goto :goto_1

    .line 109
    :catch_1
    move-exception p1

    .line 110
    if-eqz p2, :cond_5

    .line 111
    .line 112
    move p1, v0

    .line 113
    :goto_1
    if-nez p1, :cond_3

    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_3
    :goto_2
    iget p1, p0, Lz3/f;->c:I

    .line 117
    .line 118
    if-ge v0, p1, :cond_4

    .line 119
    .line 120
    invoke-virtual {v1}, LA4/r;->x()I

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    iget-object p2, p0, Lz3/f;->f:[I

    .line 125
    .line 126
    aput p1, p2, v0

    .line 127
    .line 128
    iget p2, p0, Lz3/f;->e:I

    .line 129
    .line 130
    add-int/2addr p2, p1

    .line 131
    iput p2, p0, Lz3/f;->e:I

    .line 132
    .line 133
    add-int/lit8 v0, v0, 0x1

    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_4
    const/4 p1, 0x1

    .line 137
    return p1

    .line 138
    :cond_5
    throw p1

    .line 139
    :cond_6
    :goto_3
    return v0

    .line 140
    :cond_7
    throw v2
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

.method public final b(Lq3/g;J)Z
    .locals 11

    .line 1
    iget-wide v0, p1, Lq3/g;->d:J

    .line 2
    .line 3
    invoke-virtual {p1}, Lq3/g;->w()J

    .line 4
    .line 5
    .line 6
    move-result-wide v2

    .line 7
    cmp-long v0, v0, v2

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x1

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    move v0, v2

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v0, v1

    .line 16
    :goto_0
    invoke-static {v0}, Ll4/a;->h(Z)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lz3/f;->g:LA4/r;

    .line 20
    .line 21
    const/4 v3, 0x4

    .line 22
    invoke-virtual {v0, v3}, LA4/r;->E(I)V

    .line 23
    .line 24
    .line 25
    :goto_1
    const-wide/16 v4, -0x1

    .line 26
    .line 27
    cmp-long v4, p2, v4

    .line 28
    .line 29
    if-eqz v4, :cond_1

    .line 30
    .line 31
    iget-wide v5, p1, Lq3/g;->d:J

    .line 32
    .line 33
    const-wide/16 v7, 0x4

    .line 34
    .line 35
    add-long/2addr v5, v7

    .line 36
    cmp-long v5, v5, p2

    .line 37
    .line 38
    if-gez v5, :cond_3

    .line 39
    .line 40
    :cond_1
    iget-object v5, v0, LA4/r;->c:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v5, [B

    .line 43
    .line 44
    :try_start_0
    invoke-virtual {p1, v5, v1, v3, v2}, Lq3/g;->t([BIIZ)Z

    .line 45
    .line 46
    .line 47
    move-result v5
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    goto :goto_2

    .line 49
    :catch_0
    move v5, v1

    .line 50
    :goto_2
    if-eqz v5, :cond_3

    .line 51
    .line 52
    invoke-virtual {v0, v1}, LA4/r;->H(I)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, LA4/r;->y()J

    .line 56
    .line 57
    .line 58
    move-result-wide v4

    .line 59
    const-wide/32 v6, 0x4f676753

    .line 60
    .line 61
    .line 62
    cmp-long v4, v4, v6

    .line 63
    .line 64
    if-nez v4, :cond_2

    .line 65
    .line 66
    iput v1, p1, Lq3/g;->f:I

    .line 67
    .line 68
    return v2

    .line 69
    :cond_2
    invoke-virtual {p1, v2}, Lq3/g;->n(I)V

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_3
    :goto_3
    if-eqz v4, :cond_4

    .line 74
    .line 75
    iget-wide v5, p1, Lq3/g;->d:J

    .line 76
    .line 77
    cmp-long v0, v5, p2

    .line 78
    .line 79
    if-gez v0, :cond_7

    .line 80
    .line 81
    :cond_4
    iget v0, p1, Lq3/g;->g:I

    .line 82
    .line 83
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    invoke-virtual {p1, v0}, Lq3/g;->k(I)V

    .line 88
    .line 89
    .line 90
    if-nez v0, :cond_5

    .line 91
    .line 92
    iget-object v6, p1, Lq3/g;->a:[B

    .line 93
    .line 94
    array-length v0, v6

    .line 95
    invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I

    .line 96
    .line 97
    .line 98
    move-result v8

    .line 99
    const/4 v10, 0x1

    .line 100
    const/4 v7, 0x0

    .line 101
    const/4 v9, 0x0

    .line 102
    move-object v5, p1

    .line 103
    invoke-virtual/range {v5 .. v10}, Lq3/g;->i([BIIIZ)I

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    goto :goto_4

    .line 108
    :cond_5
    move-object v5, p1

    .line 109
    :goto_4
    const/4 p1, -0x1

    .line 110
    if-eq v0, p1, :cond_6

    .line 111
    .line 112
    iget-wide v6, v5, Lq3/g;->d:J

    .line 113
    .line 114
    int-to-long v8, v0

    .line 115
    add-long/2addr v6, v8

    .line 116
    iput-wide v6, v5, Lq3/g;->d:J

    .line 117
    .line 118
    :cond_6
    const/4 p1, -0x1

    .line 119
    if-eq v0, p1, :cond_7

    .line 120
    .line 121
    move-object p1, v5

    .line 122
    goto :goto_3

    .line 123
    :cond_7
    return v1
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
