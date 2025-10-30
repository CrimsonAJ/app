.class public final Lq8/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx8/G;
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final a:Z

.field public final b:Lx8/g;

.field public c:Z

.field public final synthetic d:Lq8/v;


# direct methods
.method public constructor <init>(Lq8/v;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lq8/s;->d:Lq8/v;

    .line 5
    .line 6
    iput-boolean p2, p0, Lq8/s;->a:Z

    .line 7
    .line 8
    new-instance p1, Lx8/g;

    .line 9
    .line 10
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lq8/s;->b:Lx8/g;

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


# virtual methods
.method public final G(Lx8/g;J)V
    .locals 3

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lk8/c;->a:[B

    .line 7
    .line 8
    iget-object v0, p0, Lq8/s;->b:Lx8/g;

    .line 9
    .line 10
    invoke-virtual {v0, p1, p2, p3}, Lx8/g;->G(Lx8/g;J)V

    .line 11
    .line 12
    .line 13
    :goto_0
    iget-wide p1, v0, Lx8/g;->b:J

    .line 14
    .line 15
    const-wide/16 v1, 0x4000

    .line 16
    .line 17
    cmp-long p1, p1, v1

    .line 18
    .line 19
    if-ltz p1, :cond_0

    .line 20
    .line 21
    const/4 p1, 0x0

    .line 22
    invoke-virtual {p0, p1}, Lq8/s;->a(Z)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-void
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

.method public final a(Z)V
    .locals 12

    .line 1
    iget-object v1, p0, Lq8/s;->d:Lq8/v;

    .line 2
    .line 3
    monitor-enter v1

    .line 4
    :try_start_0
    iget-object v0, v1, Lq8/v;->l:Lq8/u;

    .line 5
    .line 6
    invoke-virtual {v0}, Lx8/d;->h()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 7
    .line 8
    .line 9
    :goto_0
    :try_start_1
    iget-wide v2, v1, Lq8/v;->e:J

    .line 10
    .line 11
    iget-wide v4, v1, Lq8/v;->f:J

    .line 12
    .line 13
    cmp-long v0, v2, v4

    .line 14
    .line 15
    if-ltz v0, :cond_0

    .line 16
    .line 17
    iget-boolean v0, p0, Lq8/s;->a:Z

    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    iget-boolean v0, p0, Lq8/s;->c:Z

    .line 22
    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    invoke-virtual {v1}, Lq8/v;->f()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_0

    .line 30
    .line 31
    invoke-virtual {v1}, Lq8/v;->l()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception v0

    .line 36
    move-object p1, v0

    .line 37
    goto :goto_3

    .line 38
    :cond_0
    :try_start_2
    iget-object v0, v1, Lq8/v;->l:Lq8/u;

    .line 39
    .line 40
    invoke-virtual {v0}, Lq8/u;->k()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Lq8/v;->b()V

    .line 44
    .line 45
    .line 46
    iget-wide v2, v1, Lq8/v;->f:J

    .line 47
    .line 48
    iget-wide v4, v1, Lq8/v;->e:J

    .line 49
    .line 50
    sub-long/2addr v2, v4

    .line 51
    iget-object v0, p0, Lq8/s;->b:Lx8/g;

    .line 52
    .line 53
    iget-wide v4, v0, Lx8/g;->b:J

    .line 54
    .line 55
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->min(JJ)J

    .line 56
    .line 57
    .line 58
    move-result-wide v10

    .line 59
    iget-wide v2, v1, Lq8/v;->e:J

    .line 60
    .line 61
    add-long/2addr v2, v10

    .line 62
    iput-wide v2, v1, Lq8/v;->e:J

    .line 63
    .line 64
    if-eqz p1, :cond_1

    .line 65
    .line 66
    iget-object p1, p0, Lq8/s;->b:Lx8/g;

    .line 67
    .line 68
    iget-wide v2, p1, Lx8/g;->b:J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 69
    .line 70
    cmp-long p1, v10, v2

    .line 71
    .line 72
    if-nez p1, :cond_1

    .line 73
    .line 74
    const/4 p1, 0x1

    .line 75
    :goto_1
    move v8, p1

    .line 76
    goto :goto_2

    .line 77
    :catchall_1
    move-exception v0

    .line 78
    move-object p1, v0

    .line 79
    goto :goto_4

    .line 80
    :cond_1
    const/4 p1, 0x0

    .line 81
    goto :goto_1

    .line 82
    :goto_2
    monitor-exit v1

    .line 83
    iget-object p1, p0, Lq8/s;->d:Lq8/v;

    .line 84
    .line 85
    iget-object p1, p1, Lq8/v;->l:Lq8/u;

    .line 86
    .line 87
    invoke-virtual {p1}, Lx8/d;->h()V

    .line 88
    .line 89
    .line 90
    :try_start_3
    iget-object p1, p0, Lq8/s;->d:Lq8/v;

    .line 91
    .line 92
    iget-object v6, p1, Lq8/v;->b:Lq8/n;

    .line 93
    .line 94
    iget v7, p1, Lq8/v;->a:I

    .line 95
    .line 96
    iget-object v9, p0, Lq8/s;->b:Lx8/g;

    .line 97
    .line 98
    invoke-virtual/range {v6 .. v11}, Lq8/n;->I(IZLx8/g;J)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 99
    .line 100
    .line 101
    iget-object p1, p0, Lq8/s;->d:Lq8/v;

    .line 102
    .line 103
    iget-object p1, p1, Lq8/v;->l:Lq8/u;

    .line 104
    .line 105
    invoke-virtual {p1}, Lq8/u;->k()V

    .line 106
    .line 107
    .line 108
    return-void

    .line 109
    :catchall_2
    move-exception v0

    .line 110
    move-object p1, v0

    .line 111
    iget-object v0, p0, Lq8/s;->d:Lq8/v;

    .line 112
    .line 113
    iget-object v0, v0, Lq8/v;->l:Lq8/u;

    .line 114
    .line 115
    invoke-virtual {v0}, Lq8/u;->k()V

    .line 116
    .line 117
    .line 118
    throw p1

    .line 119
    :goto_3
    :try_start_4
    iget-object v0, v1, Lq8/v;->l:Lq8/u;

    .line 120
    .line 121
    invoke-virtual {v0}, Lq8/u;->k()V

    .line 122
    .line 123
    .line 124
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 125
    :goto_4
    monitor-exit v1

    .line 126
    throw p1
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

.method public final c()Lx8/K;
    .locals 1

    .line 1
    iget-object v0, p0, Lq8/s;->d:Lq8/v;

    .line 2
    .line 3
    iget-object v0, v0, Lq8/v;->l:Lq8/u;

    .line 4
    .line 5
    return-object v0
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

.method public final close()V
    .locals 13

    .line 1
    iget-object v1, p0, Lq8/s;->d:Lq8/v;

    .line 2
    .line 3
    sget-object v0, Lk8/c;->a:[B

    .line 4
    .line 5
    monitor-enter v1

    .line 6
    :try_start_0
    iget-boolean v0, p0, Lq8/s;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    monitor-exit v1

    .line 11
    return-void

    .line 12
    :cond_0
    :try_start_1
    invoke-virtual {v1}, Lq8/v;->f()I

    .line 13
    .line 14
    .line 15
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 16
    const/4 v2, 0x1

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    move v0, v2

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    const/4 v0, 0x0

    .line 22
    :goto_0
    monitor-exit v1

    .line 23
    iget-object v1, p0, Lq8/s;->d:Lq8/v;

    .line 24
    .line 25
    iget-object v3, v1, Lq8/v;->j:Lq8/s;

    .line 26
    .line 27
    iget-boolean v3, v3, Lq8/s;->a:Z

    .line 28
    .line 29
    if-nez v3, :cond_3

    .line 30
    .line 31
    iget-object v3, p0, Lq8/s;->b:Lx8/g;

    .line 32
    .line 33
    iget-wide v3, v3, Lx8/g;->b:J

    .line 34
    .line 35
    const-wide/16 v5, 0x0

    .line 36
    .line 37
    cmp-long v3, v3, v5

    .line 38
    .line 39
    if-lez v3, :cond_2

    .line 40
    .line 41
    :goto_1
    iget-object v0, p0, Lq8/s;->b:Lx8/g;

    .line 42
    .line 43
    iget-wide v0, v0, Lx8/g;->b:J

    .line 44
    .line 45
    cmp-long v0, v0, v5

    .line 46
    .line 47
    if-lez v0, :cond_3

    .line 48
    .line 49
    invoke-virtual {p0, v2}, Lq8/s;->a(Z)V

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    if-eqz v0, :cond_3

    .line 54
    .line 55
    iget-object v7, v1, Lq8/v;->b:Lq8/n;

    .line 56
    .line 57
    iget v8, v1, Lq8/v;->a:I

    .line 58
    .line 59
    const-wide/16 v11, 0x0

    .line 60
    .line 61
    const/4 v9, 0x1

    .line 62
    const/4 v10, 0x0

    .line 63
    invoke-virtual/range {v7 .. v12}, Lq8/n;->I(IZLx8/g;J)V

    .line 64
    .line 65
    .line 66
    :cond_3
    iget-object v1, p0, Lq8/s;->d:Lq8/v;

    .line 67
    .line 68
    monitor-enter v1

    .line 69
    :try_start_2
    iput-boolean v2, p0, Lq8/s;->c:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 70
    .line 71
    monitor-exit v1

    .line 72
    iget-object v0, p0, Lq8/s;->d:Lq8/v;

    .line 73
    .line 74
    iget-object v0, v0, Lq8/v;->b:Lq8/n;

    .line 75
    .line 76
    invoke-virtual {v0}, Lq8/n;->flush()V

    .line 77
    .line 78
    .line 79
    iget-object v0, p0, Lq8/s;->d:Lq8/v;

    .line 80
    .line 81
    invoke-virtual {v0}, Lq8/v;->a()V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :catchall_0
    move-exception v0

    .line 86
    monitor-exit v1

    .line 87
    throw v0

    .line 88
    :catchall_1
    move-exception v0

    .line 89
    monitor-exit v1

    .line 90
    throw v0
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

.method public final flush()V
    .locals 4

    .line 1
    iget-object v0, p0, Lq8/s;->d:Lq8/v;

    .line 2
    .line 3
    sget-object v1, Lk8/c;->a:[B

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    invoke-virtual {v0}, Lq8/v;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    .line 9
    monitor-exit v0

    .line 10
    :goto_0
    iget-object v0, p0, Lq8/s;->b:Lx8/g;

    .line 11
    .line 12
    iget-wide v0, v0, Lx8/g;->b:J

    .line 13
    .line 14
    const-wide/16 v2, 0x0

    .line 15
    .line 16
    cmp-long v0, v0, v2

    .line 17
    .line 18
    if-lez v0, :cond_0

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-virtual {p0, v0}, Lq8/s;->a(Z)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lq8/s;->d:Lq8/v;

    .line 25
    .line 26
    iget-object v0, v0, Lq8/v;->b:Lq8/n;

    .line 27
    .line 28
    invoke-virtual {v0}, Lq8/n;->flush()V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    return-void

    .line 33
    :catchall_0
    move-exception v1

    .line 34
    monitor-exit v0

    .line 35
    throw v1
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
