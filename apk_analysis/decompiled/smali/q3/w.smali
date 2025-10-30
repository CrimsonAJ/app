.class public final Lq3/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD4/l;


# instance fields
.field public final a:[Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ly4/r;[Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lq3/w;->a:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>([Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lq3/w;->a:[Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public H(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 4

    .line 1
    check-cast p1, Ly4/s;

    .line 2
    .line 3
    check-cast p2, Lf5/i;

    .line 4
    .line 5
    new-instance v0, Ly4/q;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, v1, p2}, Ly4/q;-><init>(ILf5/i;)V

    .line 9
    .line 10
    .line 11
    iget-object p2, p1, LF4/e;->c:Landroid/content/Context;

    .line 12
    .line 13
    new-instance p2, LC4/g;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    const/4 v2, -0x1

    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-direct {p2, v2, v2, v3, v1}, LC4/g;-><init>(IIIZ)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, LF4/e;->u()Landroid/os/IInterface;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Ly4/j;

    .line 26
    .line 27
    new-instance v1, LC4/f;

    .line 28
    .line 29
    invoke-direct {v1, p2}, LC4/f;-><init>(LC4/g;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, LS4/a;->Q()Landroid/os/Parcel;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-static {p2, v0}, Lcom/google/android/gms/internal/cast/C;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Lq3/w;->a:[Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {p2, v0}, Landroid/os/Parcel;->writeStringArray([Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-static {p2, v1}, Lcom/google/android/gms/internal/cast/C;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    .line 45
    .line 46
    .line 47
    const/4 v0, 0x6

    .line 48
    invoke-virtual {p1, p2, v0}, LS4/a;->i1(Landroid/os/Parcel;I)V

    .line 49
    .line 50
    .line 51
    return-void
    .line 52
.end method
