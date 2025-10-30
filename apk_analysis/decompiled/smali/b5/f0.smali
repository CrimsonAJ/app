.class public final Lb5/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field public final a:Ljava/lang/String;

.field public final synthetic b:Lb5/g0;


# direct methods
.method public constructor <init>(Lb5/g0;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lb5/f0;->b:Lb5/g0;

    .line 5
    .line 6
    iput-object p2, p0, Lb5/f0;->a:Ljava/lang/String;

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


# virtual methods
.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lb5/f0;->b:Lb5/g0;

    .line 2
    .line 3
    if-eqz p2, :cond_2

    .line 4
    .line 5
    :try_start_0
    sget v0, Lcom/google/android/gms/internal/measurement/A;->e:I

    .line 6
    .line 7
    const-string v0, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService"

    .line 8
    .line 9
    invoke-interface {p2, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    instance-of v2, v1, Lcom/google/android/gms/internal/measurement/B;

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    check-cast v1, Lcom/google/android/gms/internal/measurement/B;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v1, Lcom/google/android/gms/internal/measurement/z;

    .line 21
    .line 22
    const/4 v2, 0x4

    .line 23
    invoke-direct {v1, p2, v0, v2}, LS4/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;I)V

    .line 24
    .line 25
    .line 26
    :goto_0
    if-nez v1, :cond_1

    .line 27
    .line 28
    iget-object p2, p1, Lb5/g0;->a:Lb5/n0;

    .line 29
    .line 30
    iget-object p2, p2, Lb5/n0;->i:Lb5/V;

    .line 31
    .line 32
    invoke-static {p2}, Lb5/n0;->f(Lb5/x0;)V

    .line 33
    .line 34
    .line 35
    iget-object p2, p2, Lb5/V;->i:Lb5/T;

    .line 36
    .line 37
    const-string v0, "Install Referrer Service implementation was not found"

    .line 38
    .line 39
    invoke-virtual {p2, v0}, Lb5/T;->b(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :catch_0
    move-exception p2

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    iget-object p2, p1, Lb5/g0;->a:Lb5/n0;

    .line 46
    .line 47
    iget-object v0, p2, Lb5/n0;->i:Lb5/V;

    .line 48
    .line 49
    invoke-static {v0}, Lb5/n0;->f(Lb5/x0;)V

    .line 50
    .line 51
    .line 52
    iget-object v0, v0, Lb5/V;->n:Lb5/T;

    .line 53
    .line 54
    const-string v2, "Install Referrer Service connected"

    .line 55
    .line 56
    invoke-virtual {v0, v2}, Lb5/T;->b(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    iget-object p2, p2, Lb5/n0;->j:Lb5/m0;

    .line 60
    .line 61
    invoke-static {p2}, Lb5/n0;->f(Lb5/x0;)V

    .line 62
    .line 63
    .line 64
    new-instance v0, LS5/o;

    .line 65
    .line 66
    invoke-direct {v0, p0, v1, p0}, LS5/o;-><init>(Lb5/f0;Lcom/google/android/gms/internal/measurement/B;Lb5/f0;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p2, v0}, Lb5/m0;->v0(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :goto_1
    iget-object p1, p1, Lb5/g0;->a:Lb5/n0;

    .line 74
    .line 75
    iget-object p1, p1, Lb5/n0;->i:Lb5/V;

    .line 76
    .line 77
    invoke-static {p1}, Lb5/n0;->f(Lb5/x0;)V

    .line 78
    .line 79
    .line 80
    const-string v0, "Exception occurred while calling Install Referrer API"

    .line 81
    .line 82
    iget-object p1, p1, Lb5/V;->i:Lb5/T;

    .line 83
    .line 84
    invoke-virtual {p1, p2, v0}, Lb5/T;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :cond_2
    iget-object p1, p1, Lb5/g0;->a:Lb5/n0;

    .line 89
    .line 90
    iget-object p1, p1, Lb5/n0;->i:Lb5/V;

    .line 91
    .line 92
    invoke-static {p1}, Lb5/n0;->f(Lb5/x0;)V

    .line 93
    .line 94
    .line 95
    const-string p2, "Install Referrer connection returned with null binder"

    .line 96
    .line 97
    iget-object p1, p1, Lb5/V;->i:Lb5/T;

    .line 98
    .line 99
    invoke-virtual {p1, p2}, Lb5/T;->b(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    return-void
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

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lb5/f0;->b:Lb5/g0;

    .line 2
    .line 3
    iget-object p1, p1, Lb5/g0;->a:Lb5/n0;

    .line 4
    .line 5
    iget-object p1, p1, Lb5/n0;->i:Lb5/V;

    .line 6
    .line 7
    invoke-static {p1}, Lb5/n0;->f(Lb5/x0;)V

    .line 8
    .line 9
    .line 10
    const-string v0, "Install Referrer Service disconnected"

    .line 11
    .line 12
    iget-object p1, p1, Lb5/V;->n:Lb5/T;

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Lb5/T;->b(Ljava/lang/String;)V

    .line 15
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
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method
