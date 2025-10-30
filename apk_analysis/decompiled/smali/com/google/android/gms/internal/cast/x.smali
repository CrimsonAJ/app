.class public final synthetic Lcom/google/android/gms/internal/cast/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf5/e;
.implements Lf5/d;


# instance fields
.field public final synthetic a:Lf5/i;


# direct methods
.method public synthetic constructor <init>(Lf5/i;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/cast/x;->a:Lf5/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public o(Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/cast/M;

    .line 2
    .line 3
    sget-object v0, Lcom/google/android/gms/internal/cast/z;->d:Ly4/b;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    iget-object p1, p1, Lcom/google/android/gms/internal/cast/M;->a:Lcom/google/android/gms/internal/cast/T;

    .line 9
    .line 10
    iget-object p1, p1, Lcom/google/android/gms/internal/cast/T;->a:Lcom/google/android/gms/internal/cast/P;

    .line 11
    .line 12
    invoke-static {p1}, LF4/y;->h(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget p1, p1, Lcom/google/android/gms/internal/cast/P;->a:I

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    if-ne p1, v1, :cond_0

    .line 19
    .line 20
    move v0, v1

    .line 21
    :cond_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iget-object v0, p0, Lcom/google/android/gms/internal/cast/x;->a:Lf5/i;

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Lf5/i;->d(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    return-void
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public y(Ljava/lang/Exception;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    sget-object v1, Lcom/google/android/gms/internal/cast/z;->d:Ly4/b;

    .line 5
    .line 6
    const-string v2, "get checkbox consent failed"

    .line 7
    .line 8
    invoke-virtual {v1, p1, v2, v0}, Ly4/b;->a(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 12
    .line 13
    iget-object v0, p0, Lcom/google/android/gms/internal/cast/x;->a:Lf5/i;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lf5/i;->d(Ljava/lang/Object;)V

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
