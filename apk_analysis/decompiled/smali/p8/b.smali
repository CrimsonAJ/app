.class public final Lp8/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx8/G;
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final a:Lx8/q;

.field public b:Z

.field public final synthetic c:LU6/a;


# direct methods
.method public constructor <init>(LU6/a;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lp8/b;->c:LU6/a;

    .line 5
    .line 6
    new-instance v0, Lx8/q;

    .line 7
    .line 8
    iget-object p1, p1, LU6/a;->e:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p1, Lx8/B;

    .line 11
    .line 12
    iget-object p1, p1, Lx8/B;->a:Lx8/G;

    .line 13
    .line 14
    invoke-interface {p1}, Lx8/G;->c()Lx8/K;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-direct {v0, p1}, Lx8/q;-><init>(Lx8/K;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lp8/b;->a:Lx8/q;

    .line 22
    .line 23
    return-void
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
.method public final G(Lx8/g;J)V
    .locals 4

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lp8/b;->b:Z

    .line 7
    .line 8
    const-string v1, "closed"

    .line 9
    .line 10
    if-nez v0, :cond_2

    .line 11
    .line 12
    const-wide/16 v2, 0x0

    .line 13
    .line 14
    cmp-long v0, p2, v2

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    iget-object v0, p0, Lp8/b;->c:LU6/a;

    .line 20
    .line 21
    iget-object v2, v0, LU6/a;->e:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v2, Lx8/B;

    .line 24
    .line 25
    iget-boolean v3, v2, Lx8/B;->c:Z

    .line 26
    .line 27
    if-nez v3, :cond_1

    .line 28
    .line 29
    iget-object v1, v2, Lx8/B;->b:Lx8/g;

    .line 30
    .line 31
    invoke-virtual {v1, p2, p3}, Lx8/g;->y0(J)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2}, Lx8/B;->a()Lx8/h;

    .line 35
    .line 36
    .line 37
    iget-object v0, v0, LU6/a;->e:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, Lx8/B;

    .line 40
    .line 41
    const-string v1, "\r\n"

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Lx8/B;->X(Ljava/lang/String;)Lx8/h;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, p1, p2, p3}, Lx8/B;->G(Lx8/g;J)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v1}, Lx8/B;->X(Ljava/lang/String;)Lx8/h;

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 54
    .line 55
    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p1

    .line 59
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 60
    .line 61
    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw p1
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

.method public final c()Lx8/K;
    .locals 1

    .line 1
    iget-object v0, p0, Lp8/b;->a:Lx8/q;

    .line 2
    .line 3
    return-object v0
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

.method public final declared-synchronized close()V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lp8/b;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :cond_0
    const/4 v0, 0x1

    .line 9
    :try_start_1
    iput-boolean v0, p0, Lp8/b;->b:Z

    .line 10
    .line 11
    iget-object v0, p0, Lp8/b;->c:LU6/a;

    .line 12
    .line 13
    iget-object v0, v0, LU6/a;->e:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lx8/B;

    .line 16
    .line 17
    const-string v1, "0\r\n\r\n"

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lx8/B;->X(Ljava/lang/String;)Lx8/h;

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lp8/b;->c:LU6/a;

    .line 23
    .line 24
    iget-object v1, p0, Lp8/b;->a:Lx8/q;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    iget-object v0, v1, Lx8/q;->e:Lx8/K;

    .line 30
    .line 31
    sget-object v2, Lx8/K;->d:Lx8/J;

    .line 32
    .line 33
    iput-object v2, v1, Lx8/q;->e:Lx8/K;

    .line 34
    .line 35
    invoke-virtual {v0}, Lx8/K;->a()Lx8/K;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Lx8/K;->b()Lx8/K;

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Lp8/b;->c:LU6/a;

    .line 42
    .line 43
    const/4 v1, 0x3

    .line 44
    iput v1, v0, LU6/a;->a:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 45
    .line 46
    monitor-exit p0

    .line 47
    return-void

    .line 48
    :catchall_0
    move-exception v0

    .line 49
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 50
    throw v0
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

.method public final declared-synchronized flush()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lp8/b;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_1
    iget-object v0, p0, Lp8/b;->c:LU6/a;

    .line 9
    .line 10
    iget-object v0, v0, LU6/a;->e:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lx8/B;

    .line 13
    .line 14
    invoke-virtual {v0}, Lx8/B;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 15
    .line 16
    .line 17
    monitor-exit p0

    .line 18
    return-void

    .line 19
    :catchall_0
    move-exception v0

    .line 20
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 21
    throw v0
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
