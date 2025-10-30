.class public abstract Lco/notix/s8;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:LA7/e;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Lco/notix/r8;->a:Lco/notix/r8;

    invoke-static {v0}, LZ0/a;->q(LO7/a;)LA7/l;

    move-result-object v0

    sput-object v0, Lco/notix/s8;->b:LA7/e;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/notix/s8;->a:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lco/notix/s8;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public abstract a()Lco/notix/td;
.end method

.method public abstract b()Lco/notix/td;
.end method

.method public abstract c()Lco/notix/t8;
.end method
