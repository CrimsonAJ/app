.class public final Lcom/google/android/gms/internal/cast/b3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/cast/g3;


# instance fields
.field public final a:Lcom/google/android/gms/internal/cast/E2;

.field public final b:Lcom/google/android/gms/internal/cast/w0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/cast/w0;Lcom/google/android/gms/internal/cast/E2;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/cast/K2;->a:Lcom/google/android/gms/internal/cast/w0;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/google/android/gms/internal/cast/b3;->b:Lcom/google/android/gms/internal/cast/w0;

    .line 7
    .line 8
    iput-object p2, p0, Lcom/google/android/gms/internal/cast/b3;->a:Lcom/google/android/gms/internal/cast/E2;

    .line 9
    .line 10
    return-void
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
.method public final a(Ljava/lang/Object;Lcom/google/android/gms/internal/cast/W2;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/k1;->i(Ljava/lang/Object;)Ljava/lang/ClassCastException;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    throw p1
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

.method public final b(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/cast/b3;->b:Lcom/google/android/gms/internal/cast/w0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-object v0, p1

    .line 7
    check-cast v0, Lcom/google/android/gms/internal/cast/N2;

    .line 8
    .line 9
    iget-object v0, v0, Lcom/google/android/gms/internal/cast/N2;->zzc:Lcom/google/android/gms/internal/cast/j3;

    .line 10
    .line 11
    iget-boolean v1, v0, Lcom/google/android/gms/internal/cast/j3;->d:Z

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    iput-boolean v1, v0, Lcom/google/android/gms/internal/cast/j3;->d:Z

    .line 17
    .line 18
    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/cast/K2;->a:Lcom/google/android/gms/internal/cast/w0;

    .line 19
    .line 20
    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/k1;->i(Ljava/lang/Object;)Ljava/lang/ClassCastException;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    throw p1
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

.method public final c(Lcom/google/android/gms/internal/cast/N2;)I
    .locals 2

    .line 1
    iget-object p1, p1, Lcom/google/android/gms/internal/cast/N2;->zzc:Lcom/google/android/gms/internal/cast/j3;

    .line 2
    .line 3
    iget v0, p1, Lcom/google/android/gms/internal/cast/j3;->c:I

    .line 4
    .line 5
    const/4 v1, -0x1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput v0, p1, Lcom/google/android/gms/internal/cast/j3;->c:I

    .line 10
    .line 11
    :cond_0
    return v0
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

.method public final d(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/k1;->i(Ljava/lang/Object;)Ljava/lang/ClassCastException;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    throw p1
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

.method public final e(Lcom/google/android/gms/internal/cast/N2;Lcom/google/android/gms/internal/cast/N2;)Z
    .locals 0

    .line 1
    iget-object p1, p1, Lcom/google/android/gms/internal/cast/N2;->zzc:Lcom/google/android/gms/internal/cast/j3;

    .line 2
    .line 3
    iget-object p2, p2, Lcom/google/android/gms/internal/cast/N2;->zzc:Lcom/google/android/gms/internal/cast/j3;

    .line 4
    .line 5
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/cast/j3;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    return p1

    .line 13
    :cond_0
    const/4 p1, 0x1

    .line 14
    return p1
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

.method public final f(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p1, p2}, Lcom/google/android/gms/internal/cast/h3;->n(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
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

.method public final g(Lcom/google/android/gms/internal/cast/N2;)I
    .locals 0

    .line 1
    iget-object p1, p1, Lcom/google/android/gms/internal/cast/N2;->zzc:Lcom/google/android/gms/internal/cast/j3;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const p1, 0x7bc6f

    .line 7
    .line 8
    .line 9
    return p1
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

.method public final l()Lcom/google/android/gms/internal/cast/N2;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/cast/b3;->a:Lcom/google/android/gms/internal/cast/E2;

    .line 2
    .line 3
    instance-of v1, v0, Lcom/google/android/gms/internal/cast/N2;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    check-cast v0, Lcom/google/android/gms/internal/cast/N2;

    .line 9
    .line 10
    const/4 v1, 0x4

    .line 11
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/cast/N2;->h(ILcom/google/android/gms/internal/cast/N2;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lcom/google/android/gms/internal/cast/N2;

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    check-cast v0, Lcom/google/android/gms/internal/cast/N2;

    .line 19
    .line 20
    const/4 v1, 0x5

    .line 21
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/cast/N2;->h(ILcom/google/android/gms/internal/cast/N2;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Lcom/google/android/gms/internal/cast/M2;

    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/google/android/gms/internal/cast/M2;->c()Lcom/google/android/gms/internal/cast/N2;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    return-object v0
    .line 32
.end method
